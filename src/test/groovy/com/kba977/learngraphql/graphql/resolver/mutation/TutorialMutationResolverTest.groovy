package com.kba977.learngraphql.graphql.resolver.mutation


import com.kba977.learngraphql.graphql.type.tutorial.UpdateTutorialInput
import com.kba977.learngraphql.model.Tutorial
import com.kba977.learngraphql.service.TutorialService
import org.apache.ibatis.javassist.NotFoundException
import spock.lang.Specification

import static com.kba977.learngraphql.helper.Common.generateRandomNumber

class TutorialMutationResolverTest extends Specification {

  def tutorialService = Mock(TutorialService)
  def resolver = new TutorialMutationResolver(tutorialService: tutorialService)

  def "UpdateTutorial With Exception"() {
    given:
    def id = generateRandomNumber()
    def updateTutorial = new UpdateTutorialInput(title: "Update Title", description: "Update Description")

    when:
    resolver.updateTutorial(id, updateTutorial)

    then:
    1 * tutorialService.getById(id) >> null
    0 * tutorialService.updateById(_)
    def e = thrown(NotFoundException)
    e.message == 'Not found Tutorial to update!'
  }

  def "UpdateTutorial"() {
    given:
    def id = generateRandomNumber()
    def authorId = generateRandomNumber()
    def tutorial = new Tutorial(id: id, title: "Old Title", description: "Old description", authorId: authorId)
    def updateTutorial = new UpdateTutorialInput(title: "Update Title", description: "Update Description")

    when:
    resolver.updateTutorial(id, updateTutorial)

    then:
    2 * tutorialService.getById(id) >> tutorial
    1 * tutorialService.updateById({
      it.title == "Update Title"
      it.description == "Update Description"
    }) >> true
  }
}
