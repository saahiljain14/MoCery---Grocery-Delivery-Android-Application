package com.sahil.jain.domain.mock;

import com.sahil.jain.model.GlobaDataHolder;
import com.sahil.jain.model.entities.Product;
import com.sahil.jain.model.entities.ProductCategoryModel;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

/*
 * This class serve as fake server and provides dummy product and category with real Image Urls taken from flipkart
 */
public class FakeWebServer {

	private static FakeWebServer fakeServer;

	void initiateFakeServer() {

		addCategory();

	}

	public void addCategory() {

		ArrayList<ProductCategoryModel> listOfCategory = new ArrayList<ProductCategoryModel>();

		listOfCategory
				.add(new ProductCategoryModel(
						"Fruits & Vegies",
						"Vegetables, Fruits",
						"10%",
						"http://userfiles.steadyhealth.com/userfiles/articles/anti_aging_fruits_and_vegetables_f_280x120.jpg"));

		listOfCategory
				.add(new ProductCategoryModel(
						"Home & Office Needs",
						"Stationery & Magazines, Pooja Needs, Plasticware, Storage & Containers",
						"10%",
						"http://k2.shld.net/07081630/ue/home/k_ship_us1.jpg"));

		listOfCategory
				.add(new ProductCategoryModel(
						"Household Needs",
						"Laundry, Detergents, Dishwashers, Cleaners",
						"10%",
						"http://userfiles.steadyhealth.com/userfiles/115954/articles/homemade_cleaners_f_280x120.jpg"));

		listOfCategory
				.add(new ProductCategoryModel(
						"Personal Care",
						"Bath & Body, Hair Care, Skin Care, Oral Care, Deos",
						"10%",
						"http://www.ideas4weddings.com/gallery/cheap-wedding-favors-picture/thumbs/thumbs_Cheap-Wedding-Favors-1.jpg"));

		listOfCategory
				.add(new ProductCategoryModel(
						"Breakfast & Dairy",
						"Milk & Milk Products, Breads & Eggs, Paneer & Curd",
						"10%",
						"http://sagarmilkdairy.malbecho.net/cart/php/store/search_banner/b1_06_13_2016_18_22_01.png"));

		listOfCategory
				.add(new ProductCategoryModel(
						"Biscuits, Snacks & Chocolates",
						"Biscuits, Cookies, Namkeen, Snacks, Chips",
						"10%",
						"http://www.ishida.com/ww/jp/places/food-plants/weighing/biscuits-bakery/images/P01-01s_snack.jpg"));

		listOfCategory
				.add(new ProductCategoryModel(
						"Beverages",
						"Soft Drinks, Juices, Tea, Coffee, Health & Energy Drink, Water",
						"10%",
						"http://userfiles.steadyhealth.com/userfiles/220505/articles/alcohol1_f_280x120.jpg"));

		listOfCategory
				.add(new ProductCategoryModel(
						"Noodles, Pasta & Instant Food",
						"Noodles, Vermicelli, Pasta, Soup, Ready to make",
						"10%",
						"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcS-EpfuunQq32swRRxTfT0BqM7Yji9AcwjMzgcwXSC6E2Zw51_IbA"));

		listOfCategory
				.add(new ProductCategoryModel(
						"Sauces, Jams & Condiments",
						"Sauces, Jams, Spreads, Pickles, Chutneys, Dressings & Dips",
						"10%",
						"http://userfiles.steadyhealth.com/userfiles/articles/aquacultured_versus_wild_fish_in_a_healthy_diet_f_280x120.jpg"));

		listOfCategory
				.add(new ProductCategoryModel(
						"Grocery & Staples",
						"Pulses, Atta, Rice, Dry Fruits & Nuts, Edible Oils & Ghee",
						"15%",
						"http://userfiles.steadyhealth.com/userfiles/23630/articles/Feb%202016/whole-grains%20_f_280x120.jpg"));

		GlobaDataHolder.getGlobaDataHolder().setListOfCategory(listOfCategory);
	}

	public void getAllFruitsAndVegie() {

		ConcurrentHashMap<String, ArrayList<Product>> productMap = new ConcurrentHashMap<String, ArrayList<Product>>();

		ArrayList<Product> vegetables = new ArrayList<Product>();

		// Vegetables
		vegetables
				.add(new Product(
						"Tomato",
						"  500 gm",
						"Red fresh tomato",
						"25",
						"20",
						"20",
						"0",
						"https://bigoven-res.cloudinary.com/image/upload/t_recipe-256/slow-roasted-tomato-basil-soup.jpg",
						""));

		productMap.put("Vegetables", vegetables);

		vegetables
				.add(new Product(
						"Onion",
						"  1 Kg",
						"Description",
						"48",
						"",
						"45",
						"0",
						"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ2Zy21lLfSy5iPZimYnmREmdH_gfWeOY1urRGMb8mGunDl0Dhurg",
						""));

		productMap.put("Vegetables", vegetables);

		vegetables
				.add(new Product(
						"Potato",
						"  1 Kg",
						"Description",
						"40",
						"20",
						"32",
						"0",
						"https://dtgxwmigmg3gc.cloudfront.net/files/4f5c391ac566d73be000bfae-icon-256x256.png",
						""));

		productMap.put("Vegetables", vegetables);

		vegetables
				.add(new Product(
						"Lady Finger",
						"  250 gm",
						"Description",
						"40",
						"",
						"35",
						"0",
						"http://www.dwibhashi.org/object_images/10016.png",
						""));

		productMap.put("Vegetables", vegetables);

		vegetables
				.add(new Product(
						"Green Capsicum",
						"  500 gm",
						"Description",
						"60",
						"25",
						"45",
						"0",
						"https://dtgxwmigmg3gc.cloudfront.net/files/543720b0e1272f6e82000128-icon-256x256.png",
						""));

		productMap.put("Vegetables", vegetables);

		vegetables
				.add(new Product(
						"Green Chilli",
						"  100 gm",
						"Description",
						"30",
						"",
						"25",
						"0",
						"http://www.dwibhashi.org/object_images/10032.png",
						""));

		productMap.put("Vegetables", vegetables);

		vegetables
				.add(new Product(
						"Cucumber",
						"  500 gm",
						"Description",
						"30",
						"33",
						"20",
						"0",
						"https://s3.amazonaws.com/pickacarrot2/clear_creek_seeds/b92c3e2a5d9ff017b141b3a184bef7bf5b08a398_fb4d3ca9fde8ec0b3bb6031a79af0340b1bfa041_c7bb1dfe216b0ef33e1f5dba9b42addd2218db5f.jpg",
						""));

		productMap.put("Vegetables", vegetables);

        ArrayList<Product> fruits = new ArrayList<Product>();

        // Fruits
        fruits
                .add(new Product(
                        "Apple",
                        "  500 gm",
                        "description",
                        "100",
                        "20",
                        "80",
                        "0",
                        "http://static.wixstatic.com/media/ca50b2_7149f17c611049fe959038527e70c500.jpg_256",
                        ""));

        productMap.put("Fruits", fruits);

        fruits
                .add(new Product(
                        "Banana",
                        "  6 units",
                        "description",
                        "60",
                        "16",
                        "50",
                        "0",
                        "https://dtgxwmigmg3gc.cloudfront.net/files/53d850aee1272f5c6900038d-icon-256x256.png",
                        ""));

        productMap.put("Fruits", fruits);

        fruits
                .add(new Product(
                        "Papaya",
                        "  1 Kg",
                        "description",
                        "85",
                        "11",
                        "75",
                        "0",
                        "http://mda.bigoven.com/pics/rs/256/papaya-strawberry-smoothie-with-mue.jpg",
                        ""));

        productMap.put("Fruits", fruits);

        fruits
                .add(new Product(
                        "Pomegranate (Anaar)",
                        "  500 gm",
                        "description",
                        "130",
                        "23",
                        "99",
                        "0",
                        "http://www.dwibhashi.org/object_images/9030.png",
                        ""));

        productMap.put("Fruits", fruits);

        GlobaDataHolder.getGlobaDataHolder().setProductMap(productMap);

	}


    public void getAllHomeOfficeNeeds() {

        ConcurrentHashMap<String, ArrayList<Product>> productMap = new ConcurrentHashMap<String, ArrayList<Product>>();

        ArrayList<Product> stationeryMagazines = new ArrayList<Product>();

        // Stationery & Magazines
        stationeryMagazines
                .add(new Product(
                        "Fevi Kwik",
                        " 1 gm",
                        "description",
                        "10",
                        "10",
                        "9",
                        "0",
                        "https://4.imimg.com/data4/LK/VI/MY-5742995/fevi-kwik-250x250.jpg",
                        ""));

        productMap.put("Stationery & Magazines", stationeryMagazines);

        stationeryMagazines
                .add(new Product(
                        "Document Bag",
                        " 1 unit",
                        "description",
                        "140",
                        "1",
                        "139",
                        "0",
                        "https://4.imimg.com/data4/XL/JW/MY-4696714/clear-bag-opaque-250x250.jpg",
                        ""));

        productMap.put("Stationery & Magazines", stationeryMagazines);

        stationeryMagazines
                .add(new Product(
                        "Packing Brown Tape",
                        " 1 roll",
                        "description",
                        "300",
                        "1",
                        "297",
                        "0",
                        "https://3.imimg.com/data3/FK/AT/MY-2793878/packing-tape-250x250.jpg",
                        ""));

        productMap.put("Stationery & Magazines", stationeryMagazines);

        stationeryMagazines
                .add(new Product(
                        "Clip Board",
                        " 1 unit",
                        "description",
                        "180",
                        "20",
                        "144",
                        "0",
                        "https://3.imimg.com/data3/SI/UM/MY-9670299/card-board-250x250.jpg",
                        ""));

        productMap.put("Stationery & Magazines", stationeryMagazines);

        stationeryMagazines
                .add(new Product(
                        "Business Today",
                        " 1 unit",
                        "description",
                        "60",
                        "10",
                        "54",
                        "0",
                        "http://mall.coimbatore.com/magazines/english/businesstoday.jpg",
                        ""));

        productMap.put("Stationery & Magazines", stationeryMagazines);

        stationeryMagazines
                .add(new Product(
                        "India Today",
                        " 1 unit",
                        "description",
                        "50",
                        "10",
                        "45",
                        "0",
                        "https://d2na0fb6srbte6.cloudfront.net/read/imageapi/coverforissue/983400/magazine/300/new",
                        ""));

        productMap.put("Stationery & Magazines", stationeryMagazines);

        ArrayList<Product> poojaNeeds = new ArrayList<Product>();

        // pooja needs
        poojaNeeds
                .add(new Product(
                        "Mangaldeep Bouquet Incense Sticks",
                        " 85 units",
                        "description",
                        "50",
                        "1",
                        "48",
                        "0",
                        "https://www.homebirdhouse.com/images/product/s/satya-patchouli-forest-nag-champa-incense-sticks-256px-256px.jpg",
                        ""));

        productMap.put("Pooja Needs", poojaNeeds);

        poojaNeeds
                .add(new Product(
                        "Mangaldeep Rose Dhoop",
                        " 20 units",
                        "description",
                        "15",
                        "0",
                        "15",
                        "0",
                        "https://4.imimg.com/data4/RC/EC/MY-3721748/meditation-usage-dhoop-cones-250x250.jpg",
                        ""));

        productMap.put("Pooja Needs", poojaNeeds);

        poojaNeeds
                .add(new Product(
                        "Bhakti Cotton Flower",
                        " 29 units",
                        "description",
                        "10",
                        "0",
                        "10",
                        "0",
                        "https://2.allegroimg.com/s128/01221d/f6c439a340bfb5d4a12866503062",
                        ""));

        productMap.put("Pooja Needs", poojaNeeds);

        poojaNeeds
                .add(new Product(
                        "Bhakti Gangajal",
                        " 220 ml",
                        "description",
                        "30",
                        "10",
                        "27",
                        "0",
                        "https://68.media.tumblr.com/avatar_9eef742e3252_128.png",
                        ""));

        productMap.put("Pooja Needs", poojaNeeds);

        ArrayList<Product> plasticware = new ArrayList<Product>();

        // plasticware
        plasticware
                .add(new Product(
                        "Dustpan",
                        " 1 unit",
                        "",
                        "79",
                        "10",
                        "71",
                        "0",
                        "https://images-na.ssl-images-amazon.com/images/I/71y7wyEOtDL._CR204,0,1224,1224_UX128.jpg",
                        ""));

        productMap.put("Plasticware", plasticware);

        plasticware
                .add(new Product(
                        "Premier Mug (1.5 Lt)",
                        " 1 unit",
                        "",
                        "75",
                        "0",
                        "75",
                        "0",
                        "http://www.poundstretcher.co.uk/media/catalog/product/cache/1/small_image/256x/9df78eab33525d08d6e5fb8d27136e95/2/7/275830-_1l_jug2_1000x1000.jpg",
                        ""));

        productMap.put("Plasticware", plasticware);

        plasticware
                .add(new Product(
                        "Soap Case",
                        " 2 units",
                        "",
                        "150",
                        "10",
                        "135",
                        "0",
                        "http://image3.buyincoins.com/bicv2/product/s4/1444642487_644.jpg",
                        ""));

        productMap.put("Plasticware", plasticware);

        plasticware
                .add(new Product(
                        "Bucket (20 Lt)",
                        " 1 unit",
                        "",
                        "300",
                        "20",
                        "240",
                        "0",
                        "http://jazeraspartyshop.com.au/Images/Products/Medium/tin%20bucket%20red.jp",
                        ""));

        productMap.put("Plasticware", plasticware);

        ArrayList<Product> storageContainers = new ArrayList<Product>();

        // Storage & Containers
        storageContainers
                .add(new Product(
                        "Victoria 6 Pcs Pet Bottle Set",
                        " 1 unit",
                        "",
                        "300",
                        "1",
                        "297",
                        "0",
                        "http://schoolkart.s3.amazonaws.com/catalog/product/cache/1/thumbnail/256x/9df78eab33525d08d6e5fb8d27136e95/i/g/igo_500_ml.jpeg",
                        ""));

        productMap.put("Storage & Containers", storageContainers);

        storageContainers
                .add(new Product(
                        "Dtore Fresh 5 Pcs Container Set",
                        " 1 unit",
                        "Conatiners with different size. Good quality plastic",
                        "499",
                        "10",
                        "449",
                        "0",
                        "https://images-na.ssl-images-amazon.com/images/I/71XO8TIl1cL._CR204,0,1224,1224_UX256.jpg",
                        ""));

        productMap.put("Storage & Containers", storageContainers);

        storageContainers
                .add(new Product(
                        "5 Pcs Bowl Set",
                        " 1 unit",
                        "5 piece bowls. Standard size. Mind blowing design to serve great food.",
                        "199",
                        "0",
                        "199",
                        "0",
                        "http://www.shopworldkitchen.com/dw/image/v2/AAMR_PRD/on/demandware.static/-/Sites-master-catalog-PROD/default/dwff8c3ace/products/cor_wfw_rnd_5pc_pasta_set_1040097.jpg?sw=256&sh=256&sm=fit&sfrm=tif",
                        ""));

        productMap.put("Storage & Containers", storageContainers);

        GlobaDataHolder.getGlobaDataHolder().setProductMap(productMap);

    }

    public void getAllHouseholdNeeds() {

        ConcurrentHashMap<String, ArrayList<Product>> productMap = new ConcurrentHashMap<String, ArrayList<Product>>();

        ArrayList<Product> laundry = new ArrayList<Product>();

        // Laundry
        laundry
                .add(new Product(
                        "Name",
                        " 500gm",
                        "description",
                        "25",
                        "20",
                        "20",
                        "0",
                        "http://img6a.flixcart.com/image/microwave-new/3/3/z/ifb-17pmmec1-400x400-imae4g4uzzjsumhk.jpeg",
                        ""));

        productMap.put("Laundry", laundry);

        ArrayList<Product> detergents = new ArrayList<Product>();

        // Detergents
        detergents
                .add(new Product(
                        "Name",
                        " 500gm",
                        "description",
                        "25",
                        "20",
                        "20",
                        "0",
                        "http://img6a.flixcart.com/image/microwave-new/3/3/z/ifb-17pmmec1-400x400-imae4g4uzzjsumhk.jpeg",
                        ""));

        productMap.put("Detergents", detergents);

        ArrayList<Product> dishwashers = new ArrayList<Product>();

        // Dishwashers
        dishwashers
                .add(new Product(
                        "Name",
                        " 500gm",
                        "description",
                        "25",
                        "20",
                        "20",
                        "0",
                        "http://img6a.flixcart.com/image/microwave-new/3/3/z/ifb-17pmmec1-400x400-imae4g4uzzjsumhk.jpeg",
                        ""));

        productMap.put("Dishwashers", dishwashers);

        ArrayList<Product> cleaners = new ArrayList<Product>();

        // Cleaners
        cleaners
                .add(new Product(
                        "Name",
                        " 500gm",
                        "description",
                        "25",
                        "20",
                        "20",
                        "0",
                        "http://img6a.flixcart.com/image/microwave-new/3/3/z/ifb-17pmmec1-400x400-imae4g4uzzjsumhk.jpeg",
                        ""));

        productMap.put("Cleaners", cleaners);

        GlobaDataHolder.getGlobaDataHolder().setProductMap(productMap);

    }

    public void getAllPersonalCare() {

        ConcurrentHashMap<String, ArrayList<Product>> productMap = new ConcurrentHashMap<String, ArrayList<Product>>();

        ArrayList<Product> bathBody = new ArrayList<Product>();

        // Bath & Body
        bathBody
                .add(new Product(
                        "Name",
                        " 500gm",
                        "description",
                        "25",
                        "20",
                        "20",
                        "0",
                        "http://img6a.flixcart.com/image/microwave-new/3/3/z/ifb-17pmmec1-400x400-imae4g4uzzjsumhk.jpeg",
                        ""));

        productMap.put("Bath & Body", bathBody);

        ArrayList<Product> hairCare = new ArrayList<Product>();

        // Hair Care
        hairCare
                .add(new Product(
                        "Name",
                        " 500gm",
                        "description",
                        "25",
                        "20",
                        "20",
                        "0",
                        "http://img6a.flixcart.com/image/microwave-new/3/3/z/ifb-17pmmec1-400x400-imae4g4uzzjsumhk.jpeg",
                        ""));

        productMap.put("Hair Care", hairCare);

        ArrayList<Product> skinCare = new ArrayList<Product>();

        // Skin Care
        skinCare
                .add(new Product(
                        "Name",
                        " 500gm",
                        "description",
                        "25",
                        "20",
                        "20",
                        "0",
                        "http://img6a.flixcart.com/image/microwave-new/3/3/z/ifb-17pmmec1-400x400-imae4g4uzzjsumhk.jpeg",
                        ""));

        productMap.put("Skin Care", skinCare);

        ArrayList<Product> oralCare = new ArrayList<Product>();

        // Oral Care
        oralCare
                .add(new Product(
                        "Name",
                        " 500gm",
                        "description",
                        "25",
                        "20",
                        "20",
                        "0",
                        "http://img6a.flixcart.com/image/microwave-new/3/3/z/ifb-17pmmec1-400x400-imae4g4uzzjsumhk.jpeg",
                        ""));

        productMap.put("Oral Care", oralCare);

        ArrayList<Product> deos = new ArrayList<Product>();

        // deos
        deos
                .add(new Product(
                        "Name",
                        " 500gm",
                        "description",
                        "25",
                        "20",
                        "20",
                        "0",
                        "http://img6a.flixcart.com/image/microwave-new/3/3/z/ifb-17pmmec1-400x400-imae4g4uzzjsumhk.jpeg",
                        ""));

        productMap.put("Deos", deos);

        GlobaDataHolder.getGlobaDataHolder().setProductMap(productMap);

    }

    public void getAllBreakfastDairy() {

        ConcurrentHashMap<String, ArrayList<Product>> productMap = new ConcurrentHashMap<String, ArrayList<Product>>();

        ArrayList<Product> milkMilkProducts = new ArrayList<Product>();

        // Milk & Milk Products
        milkMilkProducts
                .add(new Product(
                        "Name",
                        " 500gm",
                        "description",
                        "25",
                        "20",
                        "20",
                        "0",
                        "http://img6a.flixcart.com/image/microwave-new/3/3/z/ifb-17pmmec1-400x400-imae4g4uzzjsumhk.jpeg",
                        ""));

        productMap.put("Milk & Milk Products", milkMilkProducts);

        ArrayList<Product> breadEggs = new ArrayList<Product>();

        // Bread & Eggs
        breadEggs
                .add(new Product(
                        "Name",
                        " 500gm",
                        "description",
                        "25",
                        "20",
                        "20",
                        "0",
                        "http://img6a.flixcart.com/image/microwave-new/3/3/z/ifb-17pmmec1-400x400-imae4g4uzzjsumhk.jpeg",
                        ""));

        productMap.put("Breads & Eggs", breadEggs);

        ArrayList<Product> paneerCurd = new ArrayList<Product>();

        // Paneer & Curd
        paneerCurd
                .add(new Product(
                        "Name",
                        " 500gm",
                        "description",
                        "25",
                        "20",
                        "20",
                        "0",
                        "http://img6a.flixcart.com/image/microwave-new/3/3/z/ifb-17pmmec1-400x400-imae4g4uzzjsumhk.jpeg",
                        ""));

        productMap.put("Paneer & Curd", paneerCurd);

        GlobaDataHolder.getGlobaDataHolder().setProductMap(productMap);

    }

    public void getAllBiscuitsSnacksChocolates() {

        ConcurrentHashMap<String, ArrayList<Product>> productMap = new ConcurrentHashMap<String, ArrayList<Product>>();

        ArrayList<Product> biscuits = new ArrayList<Product>();

        // Biscuits
        biscuits
                .add(new Product(
                        "Name",
                        " 500gm",
                        "description",
                        "25",
                        "20",
                        "20",
                        "0",
                        "http://img6a.flixcart.com/image/microwave-new/3/3/z/ifb-17pmmec1-400x400-imae4g4uzzjsumhk.jpeg",
                        ""));

        productMap.put("Biscuits", biscuits);

        ArrayList<Product> cookies = new ArrayList<Product>();

        // Cookies
        cookies
                .add(new Product(
                        "Name",
                        " 500gm",
                        "description",
                        "25",
                        "20",
                        "20",
                        "0",
                        "http://img6a.flixcart.com/image/microwave-new/3/3/z/ifb-17pmmec1-400x400-imae4g4uzzjsumhk.jpeg",
                        ""));

        productMap.put("Cookies", cookies);

        ArrayList<Product> namkeen = new ArrayList<Product>();

        //Namkeen
        namkeen
                .add(new Product(
                        "Name",
                        " 500gm",
                        "description",
                        "25",
                        "20",
                        "20",
                        "0",
                        "http://img6a.flixcart.com/image/microwave-new/3/3/z/ifb-17pmmec1-400x400-imae4g4uzzjsumhk.jpeg",
                        ""));

        productMap.put("Namkeen", namkeen);

        ArrayList<Product> snacks = new ArrayList<Product>();

        // Snacks
        snacks
                .add(new Product(
                        "Name",
                        " 500gm",
                        "description",
                        "25",
                        "20",
                        "20",
                        "0",
                        "http://img6a.flixcart.com/image/microwave-new/3/3/z/ifb-17pmmec1-400x400-imae4g4uzzjsumhk.jpeg",
                        ""));

        productMap.put("Snacks", snacks);

        ArrayList<Product> chips = new ArrayList<Product>();

        // Chips
        chips
                .add(new Product(
                        "Name",
                        " 500gm",
                        "description",
                        "25",
                        "20",
                        "20",
                        "0",
                        "http://img6a.flixcart.com/image/microwave-new/3/3/z/ifb-17pmmec1-400x400-imae4g4uzzjsumhk.jpeg",
                        ""));

        productMap.put("Chips", chips);

        GlobaDataHolder.getGlobaDataHolder().setProductMap(productMap);

    }

    public void getAllBeverages() {

        ConcurrentHashMap<String, ArrayList<Product>> productMap = new ConcurrentHashMap<String, ArrayList<Product>>();

        ArrayList<Product> softDrink = new ArrayList<Product>();

        // Soft Drink
        softDrink
                .add(new Product(
                        "Name",
                        " 500gm",
                        "description",
                        "25",
                        "20",
                        "20",
                        "0",
                        "http://img6a.flixcart.com/image/microwave-new/3/3/z/ifb-17pmmec1-400x400-imae4g4uzzjsumhk.jpeg",
                        ""));

        productMap.put("Soft Drinks", softDrink);

        ArrayList<Product> juices = new ArrayList<Product>();

        // Juices
        juices
                .add(new Product(
                        "Name",
                        " 500gm",
                        "description",
                        "25",
                        "20",
                        "20",
                        "0",
                        "http://img6a.flixcart.com/image/microwave-new/3/3/z/ifb-17pmmec1-400x400-imae4g4uzzjsumhk.jpeg",
                        ""));

        productMap.put("Juices", juices);

        ArrayList<Product> tea = new ArrayList<Product>();

        // Tea
        tea
                .add(new Product(
                        "Name",
                        " 500gm",
                        "description",
                        "25",
                        "20",
                        "20",
                        "0",
                        "http://img6a.flixcart.com/image/microwave-new/3/3/z/ifb-17pmmec1-400x400-imae4g4uzzjsumhk.jpeg",
                        ""));

        productMap.put("Tea", tea);

        ArrayList<Product> coffee = new ArrayList<Product>();

        // Coffee
        coffee
                .add(new Product(
                        "Name",
                        " 500gm",
                        "description",
                        "25",
                        "20",
                        "20",
                        "0",
                        "http://img6a.flixcart.com/image/microwave-new/3/3/z/ifb-17pmmec1-400x400-imae4g4uzzjsumhk.jpeg",
                        ""));

        productMap.put("Coffee", coffee);

        ArrayList<Product> healthEnergyDrink = new ArrayList<Product>();

        // Health & Energy Drink
        healthEnergyDrink
                .add(new Product(
                        "Name",
                        " 500gm",
                        "description",
                        "25",
                        "20",
                        "20",
                        "0",
                        "http://img6a.flixcart.com/image/microwave-new/3/3/z/ifb-17pmmec1-400x400-imae4g4uzzjsumhk.jpeg",
                        ""));

        productMap.put("Health & Energy Drink", healthEnergyDrink);

        ArrayList<Product> water = new ArrayList<Product>();

        // Water
        water
                .add(new Product(
                        "Name",
                        " 500gm",
                        "description",
                        "25",
                        "20",
                        "20",
                        "0",
                        "http://img6a.flixcart.com/image/microwave-new/3/3/z/ifb-17pmmec1-400x400-imae4g4uzzjsumhk.jpeg",
                        ""));

        productMap.put("Water", water);

        GlobaDataHolder.getGlobaDataHolder().setProductMap(productMap);

    }

    public void getAllNoodlesPastaInstantFoods() {

        ConcurrentHashMap<String, ArrayList<Product>> productMap = new ConcurrentHashMap<String, ArrayList<Product>>();

        ArrayList<Product> noodles = new ArrayList<Product>();

        //Noodles
noodles
                .add(new Product(
                        "Name",
                        " 500gm",
                        "description",
                        "25",
                        "20",
                        "20",
                        "0",
                        "http://img6a.flixcart.com/image/microwave-new/3/3/z/ifb-17pmmec1-400x400-imae4g4uzzjsumhk.jpeg",
                        ""));

        productMap.put("Noodles", noodles);

        ArrayList<Product> vermicelli = new ArrayList<Product>();

        // Vermicelli
        vermicelli
                .add(new Product(
                        "Name",
                        " 500gm",
                        "description",
                        "25",
                        "20",
                        "20",
                        "0",
                        "http://img6a.flixcart.com/image/microwave-new/3/3/z/ifb-17pmmec1-400x400-imae4g4uzzjsumhk.jpeg",
                        ""));

        productMap.put("Vermicelli", vermicelli);

        ArrayList<Product> pasta = new ArrayList<Product>();

        // Pasta
        pasta
                .add(new Product(
                        "Name",
                        " 500gm",
                        "description",
                        "25",
                        "20",
                        "20",
                        "0",
                        "http://img6a.flixcart.com/image/microwave-new/3/3/z/ifb-17pmmec1-400x400-imae4g4uzzjsumhk.jpeg",
                        ""));

        productMap.put("Pasta", pasta);

        ArrayList<Product> soup = new ArrayList<Product>();

        // Soup
        soup
                .add(new Product(
                        "Name",
                        " 500gm",
                        "description",
                        "25",
                        "20",
                        "20",
                        "0",
                        "http://img6a.flixcart.com/image/microwave-new/3/3/z/ifb-17pmmec1-400x400-imae4g4uzzjsumhk.jpeg",
                        ""));

        productMap.put("Soup", soup);

        ArrayList<Product> readyToMake = new ArrayList<Product>();

        // Ready To Make
        readyToMake
                .add(new Product(
                        "Name",
                        " 500gm",
                        "description",
                        "25",
                        "20",
                        "20",
                        "0",
                        "http://img6a.flixcart.com/image/microwave-new/3/3/z/ifb-17pmmec1-400x400-imae4g4uzzjsumhk.jpeg",
                        ""));

        productMap.put("Ready to Make", readyToMake);

        GlobaDataHolder.getGlobaDataHolder().setProductMap(productMap);

    }

    public void getAllSaucesJamsCondiments() {

        ConcurrentHashMap<String, ArrayList<Product>> productMap = new ConcurrentHashMap<String, ArrayList<Product>>();

        ArrayList<Product> sauces = new ArrayList<Product>();

        // sauces
        sauces
                .add(new Product(
                        "Name",
                        " 500gm",
                        "description",
                        "25",
                        "20",
                        "20",
                        "0",
                        "http://img6a.flixcart.com/image/microwave-new/3/3/z/ifb-17pmmec1-400x400-imae4g4uzzjsumhk.jpeg",
                        ""));

        productMap.put("Sauces", sauces);

        ArrayList<Product> jams = new ArrayList<Product>();

        // Jams
        jams
                .add(new Product(
                        "Name",
                        " 500gm",
                        "description",
                        "25",
                        "20",
                        "20",
                        "0",
                        "http://img6a.flixcart.com/image/microwave-new/3/3/z/ifb-17pmmec1-400x400-imae4g4uzzjsumhk.jpeg",
                        ""));

        productMap.put("Jams", jams);

        ArrayList<Product> spreads = new ArrayList<Product>();

        // Spreads
        spreads
                .add(new Product(
                        "Name",
                        " 500gm",
                        "description",
                        "25",
                        "20",
                        "20",
                        "0",
                        "http://img6a.flixcart.com/image/microwave-new/3/3/z/ifb-17pmmec1-400x400-imae4g4uzzjsumhk.jpeg",
                        ""));

        productMap.put("Spreads", spreads);

        ArrayList<Product> pickles = new ArrayList<Product>();

        // Pickles
        pickles
                .add(new Product(
                        "Name",
                        " 500gm",
                        "description",
                        "25",
                        "20",
                        "20",
                        "0",
                        "http://img6a.flixcart.com/image/microwave-new/3/3/z/ifb-17pmmec1-400x400-imae4g4uzzjsumhk.jpeg",
                        ""));

        productMap.put("Pickles", pickles);

        ArrayList<Product> chutneys = new ArrayList<Product>();

        // Chutneys
        chutneys
                .add(new Product(
                        "Name",
                        " 500gm",
                        "description",
                        "25",
                        "20",
                        "20",
                        "0",
                        "http://img6a.flixcart.com/image/microwave-new/3/3/z/ifb-17pmmec1-400x400-imae4g4uzzjsumhk.jpeg",
                        ""));

        productMap.put("Chutneys", chutneys);

        ArrayList<Product> dressingsDips = new ArrayList<Product>();

        // Dressings & Dips
        dressingsDips
                .add(new Product(
                        "Name",
                        " 500gm",
                        "description",
                        "25",
                        "20",
                        "20",
                        "0",
                        "http://img6a.flixcart.com/image/microwave-new/3/3/z/ifb-17pmmec1-400x400-imae4g4uzzjsumhk.jpeg",
                        ""));

        productMap.put("Dressings & Dips", dressingsDips);

        GlobaDataHolder.getGlobaDataHolder().setProductMap(productMap);

    }

    public void getAllGroceryStaples() {

        ConcurrentHashMap<String, ArrayList<Product>> productMap = new ConcurrentHashMap<String, ArrayList<Product>>();

        ArrayList<Product> pulses = new ArrayList<Product>();

        // Pulses
        pulses
                .add(new Product(
                        "Name",
                        " 500gm",
                        "description",
                        "25",
                        "20",
                        "20",
                        "0",
                        "http://img6a.flixcart.com/image/microwave-new/3/3/z/ifb-17pmmec1-400x400-imae4g4uzzjsumhk.jpeg",
                        ""));

        productMap.put("Pulses", pulses);

        ArrayList<Product> rice  = new ArrayList<Product>();

        // Rice

        rice
                .add(new Product(
                        "Name",
                        " 500gm",
                        "description",
                        "25",
                        "20",
                        "20",
                        "0",
                        "http://img6a.flixcart.com/image/microwave-new/3/3/z/ifb-17pmmec1-400x400-imae4g4uzzjsumhk.jpeg",
                        ""));

        productMap.put("Rice", rice);

        ArrayList<Product>dryFruitsNuts  = new ArrayList<Product>();

        // Dry Fruits & Nuts

        dryFruitsNuts
                .add(new Product(
                        "Name",
                        " 500gm",
                        "description",
                        "25",
                        "20",
                        "20",
                        "0",
                        "http://img6a.flixcart.com/image/microwave-new/3/3/z/ifb-17pmmec1-400x400-imae4g4uzzjsumhk.jpeg",
                        ""));

        productMap.put("Dry Fruits & Nuts", dryFruitsNuts);

        ArrayList<Product> edibleOilsGhee  = new ArrayList<Product>();

        // Edible Oils & Ghee
        edibleOilsGhee
                .add(new Product(
                        "Name",
                        " 500gm",
                        "description",
                        "25",
                        "20",
                        "20",
                        "0",
                        "http://img6a.flixcart.com/image/microwave-new/3/3/z/ifb-17pmmec1-400x400-imae4g4uzzjsumhk.jpeg",
                        ""));

        productMap.put("Edible Oils & Ghee", edibleOilsGhee);

        GlobaDataHolder.getGlobaDataHolder().setProductMap(productMap);

    }
/*
	public void getAll() {

		ConcurrentHashMap<String, ArrayList<Product>> productMap = new ConcurrentHashMap<String, ArrayList<Product>>();

		ArrayList<Product> demo = new ArrayList<Product>();

		// Vegetables
		demo
				.add(new Product(
						"Name",
						" 500gm",
						"description",
						"25",
						"20",
						"20",
						"0",
						"http://img6a.flixcart.com/image/microwave-new/3/3/z/ifb-17pmmec1-400x400-imae4g4uzzjsumhk.jpeg",
						""));

		productMap.put("DemoName", demo);

		GlobaDataHolder.getGlobaDataHolder().setProductMap(productMap);

	}*/

	public static FakeWebServer getFakeWebServer() {

		if (null == fakeServer) {
			fakeServer = new FakeWebServer();
		}
		return fakeServer;
	}

	public void getAllProducts(int productCategory) {

		if (productCategory == 0) {

			getAllFruitsAndVegie();
		} else if (productCategory == 1) {
            getAllHomeOfficeNeeds();
        } else if (productCategory == 2) {
            getAllHouseholdNeeds();
        } else if (productCategory == 3) {
            getAllPersonalCare();
        } else if (productCategory == 4) {
            getAllBreakfastDairy();
        } else if (productCategory == 5) {
            getAllBiscuitsSnacksChocolates();
        } else if (productCategory == 6) {
            getAllBeverages();
        } else if (productCategory == 7) {
            getAllNoodlesPastaInstantFoods();
        } else if (productCategory == 8) {
            getAllSaucesJamsCondiments();
        } else if (productCategory == 9) {
            getAllGroceryStaples();
        }

	}

}
