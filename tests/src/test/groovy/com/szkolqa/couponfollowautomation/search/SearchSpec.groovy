package com.szkolqa.couponfollowautomation.search

import com.szkolqa.couponfollowautomation.BaseSpec
import spock.lang.Unroll

class SearchSpec extends BaseSpec {

    @Unroll
    def 'Is link to the site available in the dropdown'() {
        when: 'I type in Dominos'
        def dropdown = homePage.searchStore(searchValue)

        then: 'I should be able to pick Dominos Pizza site from the dropdown.'
        dropdown.getDropdownHref(0) == config.url + '/site/dominos.com'

        where:
        searchValue  | _
        'Domino\'s' | _
        'domino\'s' | _
    }
}
