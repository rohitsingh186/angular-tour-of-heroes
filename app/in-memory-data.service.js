"use strict";
var InMemoryDataService = (function () {
    function InMemoryDataService() {
    }
    InMemoryDataService.prototype.createDb = function () {
        var heroes = [
            { id: 11, name: 'Thor' },
            { id: 12, name: 'Captain America' },
            { id: 13, name: 'Iron man' },
            { id: 14, name: 'Hulk' },
            { id: 15, name: 'Black Widow' },
            { id: 16, name: 'Hawkeye' },
            { id: 17, name: 'Vision' },
            { id: 18, name: 'Loki' },
            { id: 19, name: 'Superman' },
            { id: 20, name: 'Batman' }
        ];
        return { heroes: heroes };
    };
    return InMemoryDataService;
}());
exports.InMemoryDataService = InMemoryDataService;
//# sourceMappingURL=in-memory-data.service.js.map