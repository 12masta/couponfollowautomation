package com.szkolqa.biolerplate.search

import com.szkolqa.biolerplate.BaseSpec

class SearchSpec extends BaseSpec {
    def 'Is link to the site available in the dropdown'() {
        when: 'I type in Dominos'
        def dropdown = homePage.searchStore(seachValue)

        then: 'I should be able to pick Dominos Pizza site from the dropdown.'
        dropdown.getDropdownHref(0) == config.url + '/site/dominos.com'

        where:
        seachValue  | _
        'Domino\'s' | _
        'domino\'s' | _
    }
}
