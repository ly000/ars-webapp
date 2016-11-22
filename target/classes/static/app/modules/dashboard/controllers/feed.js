/**
 * Created by   : LY
 * Date created : 09.09.2016
 *
 * Description  :
 *
 */

dashboard.controller("HomeController", ['$rootScope', '$scope', '$state', '$location', 'dashboardService', 'Flash',
function ($rootScope, $scope, $state, $location, dashboardService, Flash) {
    var vm = this;

    vm.showDetails = true;
    vm.feed = {};
    
    vm.feed.mainData = [
        {
            title:          "Kurs1",
            description:    "DBS",
            theme:          "aqua",
        },
        {
            title:          "Kurs2",
            description:    "SWE2",
            theme:          "red",
        },
        {
            title:          "Kurs3",
            description:    "LinAlg",
            theme:          "green",
        },
        {
            title:          "Kurs4",
            description:    "AW-Fach",
            theme:          "yellow",
        },
    ];

    //skills progress bar
    vm.feed.skills = [
        {
            title: "Design & Development",
            theme: "aqua",
            percentage:80
        },
        {
            title: "Communication",
            theme: "red",
            percentage: 83
        },
        {
            title: "Planning & Progressing",
            theme: "green",
            percentage: 75
        },
        {
            title: "Problem Solving & Decision Making",
            theme: "yellow",
            percentage: 85
        },
        {
            title: "Loyal & Dedication",
            theme: "aqua",
            percentage: 100
        },
        {
            title: "Fun & Friendly",
            theme: "green",
            percentage: 95
        },
        {
            title: "Lazy & Sleepy",
            theme: "red",
            percentage: 40
        }
    ];

    vm.feed.tools = [
       {
           Software: "Mongo DB",
           Percentage: "80",
           theme: "yellow",
           image: "mongodb"
       },
       {
           Software: "Express JS",
           Percentage: "75",
           theme: "aqua",
           image: "express",
           progressbar: "blue"
       },
       {
           Software: "Angular JS",
           Percentage: "85",
           theme: "green",
           image: "angular",
           progressbar: "blue"
       },
       {
           Software: "Node JS",
           Percentage: "83",
           theme: "lime",
           image: "node",
           progressbar: "blue"
       },
       {
           Software: "Javascript",
           Percentage: "80",
           theme: "maroon",
           image: "javascript",
           progressbar: "blue"
       },
       {
           Software: "Type Script",
           Percentage: "70",
           theme: "Gray",
           image: "typescript",
           progressbar: "blue"
       },
       {
           Software: "jQuery & AJAX",
           Percentage: "80",
           theme: "yellow",
           image: "jquery",
           progressbar: "blue"
       },
       {
           Software: "Joomla",
           Percentage: "85",
           theme: "red",
           image: "joomla",
           progressbar: "blue"
       },
        {
            Software: "HTML 5",
            Percentage: "90",
            theme: "yellow",
            image: "html5"
        },
        {
            Software: "CSS 3",
            Percentage: "83",
            theme: "aqua",
            image: "css3",
            progressbar: "blue"
        },
        {
            Software: "SAAS",
            Percentage: "72",
            theme: "green",
            image: "saas-css",
            progressbar: "blue"
        },
        {
            Software: "Bootstrap",
            Percentage: "85",
            theme: "lime",
            image: "bootstrap",
            progressbar: "blue"
        },
        {
            Software: "Photo Shop",
            Percentage: "90",
            theme: "maroon",
            image: "photoshop",
            progressbar: "blue"
        },
        {
            Software: "Corel Draw",
            Percentage: "95",
            theme: "Gray",
            image: "coreldraw",
            progressbar: "blue"
        },
        {
            Software: "Flash",
            Percentage: "65",
            theme: "yellow",
            image: "flash",
            progressbar: "blue"
        }
    ];

    //Tools I use Carousel
    $("#owl-demo").owlCarousel({


        items: 8, //10 items above 1000px browser width
        itemsDesktop: [1000, 5], //5 items between 1000px and 901px
        itemsDesktopSmall: [900, 3], // betweem 900px and 601px
        itemsTablet: [600, 2], //2 items between 600 and 0
        itemsMobile: false, // itemsMobile disabled - inherit from itemsTablet option
    });
    $("#owl-demo").trigger('owl.play', 2000);

    // Custom Navigation Events
    $(".next").click(function () {
        $("#owl-demo").trigger('owl.next');
    })
    $(".prev").click(function () {
        $("#owl-demo").trigger('owl.prev');
    })
    $(".play").click(function () {
        $("#owl-demo").trigger('owl.play', 1000); //owl.play event accept autoPlay speed as second parameter
    })
    $(".stop").click(function () {
        $("#owl-demo").trigger('owl.stop');
    })

    //cartoon photo slider carosusel
    $("#owl-single").owlCarousel({
        navigation: true, // Show next and prev buttons
        slideSpeed: 300,
        paginationSpeed: 400,
        singleItem: true,
        autoPlay: 5000, //Set AutoPlay to 3 seconds
    });
}]);

