package loginform.servlets;


import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import loginform.model.Product;

@WebServlet("/category")
public class CategoryServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if (req.getSession().getAttribute("productsCart") == null) {
            List<Product> productsCart = new ArrayList<>();
            req.getSession().setAttribute("productsCart", productsCart);
        }
        int productId = Integer.valueOf(req.getParameter("product"));
        List<Product> productList = (List<Product>) req.getSession().getAttribute("products");
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == productId) {
                List<Product> productListCart = (List<Product>) req.getSession().getAttribute("productsCart");
                productListCart.add(productList.get(i));
                req.getSession().setAttribute("productsCart", productListCart);
                productListCart.forEach(System.out::println);
            }
        }
        resp.sendRedirect("product.jsp");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String category = req.getParameter("name");
        List<Product> products = getProducts(category);
        //   System.out.println(products.toString());
        req.getSession().setAttribute("products", products);
        resp.sendRedirect("products.jsp");
//        req.getRequestDispatcher("/products.jsp").forward(req, resp);
    }

    public List<Product> getProducts(String category) {
        if ("Mobile phones".equalsIgnoreCase(category)) {
            return List.of(new Product(12, "Iphone 14", "Apple iOS, экран 6.1\" OLED (1170x2532) 60 Гц, Apple A15 Bionic, ОЗУ 6 ГБ, память 128 ГБ, камера 12 Мп, 1 SIM (nano-SIM/eSIM), влагозащита IP68", new BigDecimal(1300), "iphone14.png", "mobile phones"),
                           new Product(13,
                                       "Samsung Galaxy M53 5G",
                                       "Android 12, Super AMOLED Plus 120 Гц, 6,7 дюйма, 1080 х 2408, 20:9, MediaTek MT6877 Dimensity 900, ОЗУ 8 ГБ, память 128 ГБ, камера 12 Мп, 1 SIM (nano-SIM/eSIM), влагозащита IP68",
                                       new BigDecimal(1100),
                                       "galaxym13.jpg",
                                       "Mobile phone"),
                           new Product(13,
                                       "Samsung Galaxy M53 5G",
                                       "Android 12, Super AMOLED Plus 120 Гц, 6,7 дюйма, 1080 х 2408, 20:9, MediaTek MT6877 Dimensity 900, ОЗУ 8 ГБ, память 128 ГБ, камера 12 Мп, 1 SIM (nano-SIM/eSIM), влагозащита IP68",
                                       new BigDecimal(1100),
                                       "galaxym53.jpg",
                                       "Mobile phone"),
                           new Product(14,
                                       "Samsung Galaxy M53 5G",
                                       "Android 12, Super AMOLED Plus 120 Гц, 6,7 дюйма, 1080 х 2408, 20:9, MediaTek MT6877 Dimensity 900, ОЗУ 8 ГБ, память 128 ГБ, камера 12 Мп, 1 SIM (nano-SIM/eSIM), влагозащита IP68",
                                       new BigDecimal(1100),
                                       "iphone11.jpeg",
                                       "Mobile phone"),
                           new Product(14,
                                       "Samsung Galaxy M53 5G",
                                       "Android 12, Super AMOLED Plus 120 Гц, 6,7 дюйма, 1080 х 2408, 20:9, MediaTek MT6877 Dimensity 900, ОЗУ 8 ГБ, память 128 ГБ, камера 12 Мп, 1 SIM (nano-SIM/eSIM), влагозащита IP68",
                                       new BigDecimal(1100),
                                       "iphone14pro.jpeg",
                                       "Mobile phone"),
                           new Product(14,
                                       "Samsung Galaxy M53 5G",
                                       "Android 12, Super AMOLED Plus 120 Гц, 6,7 дюйма, 1080 х 2408, 20:9, MediaTek MT6877 Dimensity 900, ОЗУ 8 ГБ, память 128 ГБ, камера 12 Мп, 1 SIM (nano-SIM/eSIM), влагозащита IP68",
                                       new BigDecimal(1100),
                                       "galaxym53.jpg",
                                       "Mobile phone"));

        }
        if ("Laptops".equalsIgnoreCase(category)) {
            return List.of(new Product(12, "Iphone 14", "Apple iOS, экран 6.1\" OLED (1170x2532) 60 Гц, Apple A15 Bionic, ОЗУ 6 ГБ, память 128 ГБ, камера 12 Мп, 1 SIM (nano-SIM/eSIM), влагозащита IP68", new BigDecimal(1300), "iphone14.png", "laptops"),
                           new Product(13, "Samsung Galaxy M53 5G", "Android 12, Super AMOLED Plus 120 Гц, 6,7 дюйма, 1080 х 2408, 20:9, MediaTek MT6877 Dimensity 900, ОЗУ 8 ГБ, память 128 ГБ, камера 12 Мп, 1 SIM (nano-SIM/eSIM), влагозащита IP68", new BigDecimal(1100), "galaxym13.jpg", "Laptops"),
                           new Product(13, "Samsung Galaxy M53 5G", "Android 12, Super AMOLED Plus 120 Гц, 6,7 дюйма, 1080 х 2408, 20:9, MediaTek MT6877 Dimensity 900, ОЗУ 8 ГБ, память 128 ГБ, камера 12 Мп, 1 SIM (nano-SIM/eSIM), влагозащита IP68", new BigDecimal(1100), "galaxym53.jpg", "Laptops"),
                           new Product(14, "Samsung Galaxy M53 5G", "Android 12, Super AMOLED Plus 120 Гц, 6,7 дюйма, 1080 х 2408, 20:9, MediaTek MT6877 Dimensity 900, ОЗУ 8 ГБ, память 128 ГБ, камера 12 Мп, 1 SIM (nano-SIM/eSIM), влагозащита IP68", new BigDecimal(1100), "galaxym53.jpg", "Laptops"),
                           new Product(14, "Samsung Galaxy M53 5G", "Android 12, Super AMOLED Plus 120 Гц, 6,7 дюйма, 1080 х 2408, 20:9, MediaTek MT6877 Dimensity 900, ОЗУ 8 ГБ, память 128 ГБ, камера 12 Мп, 1 SIM (nano-SIM/eSIM), влагозащита IP68", new BigDecimal(1100), "galaxym53.jpg", "Laptops"),
                           new Product(14, "Samsung Galaxy M53 5G", "Android 12, Super AMOLED Plus 120 Гц, 6,7 дюйма, 1080 х 2408, 20:9, MediaTek MT6877 Dimensity 900, ОЗУ 8 ГБ, память 128 ГБ, камера 12 Мп, 1 SIM (nano-SIM/eSIM), влагозащита IP68", new BigDecimal(1100), "galaxym53.jpg", "Laptops"),
                           new Product(14, "Samsung Galaxy M53 5G", "Android 12, Super AMOLED Plus 120 Гц, 6,7 дюйма, 1080 х 2408, 20:9, MediaTek MT6877 Dimensity 900, ОЗУ 8 ГБ, память 128 ГБ, камера 12 Мп, 1 SIM (nano-SIM/eSIM), влагозащита IP68", new BigDecimal(1100), "galaxym53.jpg", "Laptops"));


        }
        if ("GPS Navigators".equalsIgnoreCase(category)) {
            return List.of(new Product(12, "Iphone 14", "Apple iOS, экран 6.1\" OLED (1170x2532) 60 Гц, Apple A15 Bionic, ОЗУ 6 ГБ, память 128 ГБ, камера 12 Мп, 1 SIM (nano-SIM/eSIM), влагозащита IP68", new BigDecimal(1300), "iphone14.png", "GPS navigator"),
                           new Product(13,
                                       "Samsung Galaxy M53 5G",
                                       "Android 12, Super AMOLED Plus 120 Гц, 6,7 дюйма, 1080 х 2408, 20:9, MediaTek MT6877 Dimensity 900, ОЗУ 8 ГБ, память 128 ГБ, камера 12 Мп, 1 SIM (nano-SIM/eSIM), влагозащита IP68",
                                       new BigDecimal(1100),
                                       "galaxym13.jpg",
                                       "GPS navigator"),
                           new Product(13,
                                       "Samsung Galaxy M53 5G",
                                       "Android 12, Super AMOLED Plus 120 Гц, 6,7 дюйма, 1080 х 2408, 20:9, MediaTek MT6877 Dimensity 900, ОЗУ 8 ГБ, память 128 ГБ, камера 12 Мп, 1 SIM (nano-SIM/eSIM), влагозащита IP68",
                                       new BigDecimal(1100),
                                       "galaxym53.jpg",
                                       "GPS navigator"),
                           new Product(14,
                                       "Samsung Galaxy M53 5G",
                                       "Android 12, Super AMOLED Plus 120 Гц, 6,7 дюйма, 1080 х 2408, 20:9, MediaTek MT6877 Dimensity 900, ОЗУ 8 ГБ, память 128 ГБ, камера 12 Мп, 1 SIM (nano-SIM/eSIM), влагозащита IP68",
                                       new BigDecimal(1100),
                                       "galaxym53.jpg",
                                       "GPS navigator"),
                           new Product(14,
                                       "Samsung Galaxy M53 5G",
                                       "Android 12, Super AMOLED Plus 120 Гц, 6,7 дюйма, 1080 х 2408, 20:9, MediaTek MT6877 Dimensity 900, ОЗУ 8 ГБ, память 128 ГБ, камера 12 Мп, 1 SIM (nano-SIM/eSIM), влагозащита IP68",
                                       new BigDecimal(1100),
                                       "galaxym53.jpg",
                                       "GPS navigator"),
                           new Product(14,
                                       "Samsung Galaxy M53 5G",
                                       "Android 12, Super AMOLED Plus 120 Гц, 6,7 дюйма, 1080 х 2408, 20:9, MediaTek MT6877 Dimensity 900, ОЗУ 8 ГБ, память 128 ГБ, камера 12 Мп, 1 SIM (nano-SIM/eSIM), влагозащита IP68",
                                       new BigDecimal(1100),
                                       "galaxym53.jpg",
                                       "GPS navigator"),
                           new Product(14,
                                       "Samsung Galaxy M53 5G",
                                       "Android 12, Super AMOLED Plus 120 Гц, 6,7 дюйма, 1080 х 2408, 20:9, MediaTek MT6877 Dimensity 900, ОЗУ 8 ГБ, память 128 ГБ, камера 12 Мп, 1 SIM (nano-SIM/eSIM), влагозащита IP68",
                                       new BigDecimal(1100),
                                       "galaxym53.jpg",
                                       "GPS navigator"));


        }
        if ("fridges".equalsIgnoreCase(category)) {
            return List.of(new Product(12, "Iphone 14", "Apple iOS, экран 6.1\" OLED (1170x2532) 60 Гц, Apple A15 Bionic, ОЗУ 6 ГБ, память 128 ГБ, камера 12 Мп, 1 SIM (nano-SIM/eSIM), влагозащита IP68", new BigDecimal(1300), "iphone14.png", "fridges"),
                           new Product(13, "Samsung Galaxy M53 5G", "Android 12, Super AMOLED Plus 120 Гц, 6,7 дюйма, 1080 х 2408, 20:9, MediaTek MT6877 Dimensity 900, ОЗУ 8 ГБ, память 128 ГБ, камера 12 Мп, 1 SIM (nano-SIM/eSIM), влагозащита IP68", new BigDecimal(1100), "galaxym13.jpg", "fridges"),
                           new Product(13, "Samsung Galaxy M53 5G", "Android 12, Super AMOLED Plus 120 Гц, 6,7 дюйма, 1080 х 2408, 20:9, MediaTek MT6877 Dimensity 900, ОЗУ 8 ГБ, память 128 ГБ, камера 12 Мп, 1 SIM (nano-SIM/eSIM), влагозащита IP68", new BigDecimal(1100), "galaxym53.jpg", "fridges"),
                           new Product(14, "Samsung Galaxy M53 5G", "Android 12, Super AMOLED Plus 120 Гц, 6,7 дюйма, 1080 х 2408, 20:9, MediaTek MT6877 Dimensity 900, ОЗУ 8 ГБ, память 128 ГБ, камера 12 Мп, 1 SIM (nano-SIM/eSIM), влагозащита IP68", new BigDecimal(1100), "galaxym53.jpg", "fridges"),
                           new Product(14, "Samsung Galaxy M53 5G", "Android 12, Super AMOLED Plus 120 Гц, 6,7 дюйма, 1080 х 2408, 20:9, MediaTek MT6877 Dimensity 900, ОЗУ 8 ГБ, память 128 ГБ, камера 12 Мп, 1 SIM (nano-SIM/eSIM), влагозащита IP68", new BigDecimal(1100), "galaxym53.jpg", "fridges"),
                           new Product(14, "Samsung Galaxy M53 5G", "Android 12, Super AMOLED Plus 120 Гц, 6,7 дюйма, 1080 х 2408, 20:9, MediaTek MT6877 Dimensity 900, ОЗУ 8 ГБ, память 128 ГБ, камера 12 Мп, 1 SIM (nano-SIM/eSIM), влагозащита IP68", new BigDecimal(1100), "galaxym53.jpg", "fridges"),
                           new Product(14, "Samsung Galaxy M53 5G", "Android 12, Super AMOLED Plus 120 Гц, 6,7 дюйма, 1080 х 2408, 20:9, MediaTek MT6877 Dimensity 900, ОЗУ 8 ГБ, память 128 ГБ, камера 12 Мп, 1 SIM (nano-SIM/eSIM), влагозащита IP68", new BigDecimal(1100), "galaxym53.jpg", "fridges"));


        }
        if ("cars".equalsIgnoreCase(category)) {
            return List.of(new Product(12, "Iphone 14", "Apple iOS, экран 6.1\" OLED (1170x2532) 60 Гц, Apple A15 Bionic, ОЗУ 6 ГБ, память 128 ГБ, камера 12 Мп, 1 SIM (nano-SIM/eSIM), влагозащита IP68", new BigDecimal(1300), "iphone14.png", "cars"),
                           new Product(13, "Samsung Galaxy M53 5G", "Android 12, Super AMOLED Plus 120 Гц, 6,7 дюйма, 1080 х 2408, 20:9, MediaTek MT6877 Dimensity 900, ОЗУ 8 ГБ, память 128 ГБ, камера 12 Мп, 1 SIM (nano-SIM/eSIM), влагозащита IP68", new BigDecimal(1100), "galaxym13.jpg", "cars"),
                           new Product(13, "Samsung Galaxy M53 5G", "Android 12, Super AMOLED Plus 120 Гц, 6,7 дюйма, 1080 х 2408, 20:9, MediaTek MT6877 Dimensity 900, ОЗУ 8 ГБ, память 128 ГБ, камера 12 Мп, 1 SIM (nano-SIM/eSIM), влагозащита IP68", new BigDecimal(1100), "galaxym53.jpg", "cars"),
                           new Product(14, "Samsung Galaxy M53 5G", "Android 12, Super AMOLED Plus 120 Гц, 6,7 дюйма, 1080 х 2408, 20:9, MediaTek MT6877 Dimensity 900, ОЗУ 8 ГБ, память 128 ГБ, камера 12 Мп, 1 SIM (nano-SIM/eSIM), влагозащита IP68", new BigDecimal(1100), "galaxym53.jpg", "cars"),
                           new Product(14, "Samsung Galaxy M53 5G", "Android 12, Super AMOLED Plus 120 Гц, 6,7 дюйма, 1080 х 2408, 20:9, MediaTek MT6877 Dimensity 90, ОЗУ 8 ГБ, память 128 ГБ, камера 12 Мп, 1 SIM (nano-SIM/eSIM), влагозащита IP68", new BigDecimal(1100), "galaxym53.jpg", "cars"),
                           new Product(14, "Samsung Galaxy M53 5G", "Android 12, Super AMOLED Plus 120 Гц, 6,7 дюйма, 1080 х 2408, 20:9, MediaTek MT6877 Dimensity 900, ОЗУ 8 ГБ, память 128 ГБ, камера 12 Мп, 1 SIM (nano-SIM/eSIM), влагозащита IP68", new BigDecimal(1100), "galaxym53.jpg", "cars"),
                           new Product(14, "Samsung Galaxy M53 5G", "Android 12, Super AMOLED Plus 120 Гц, 6,7 дюйма, 1080 х 2408, 20:9, MediaTek MT6877 Dimensity 900, ОЗУ 8 ГБ, память 128 ГБ, камера 12 Мп, 1 SIM (nano-SIM/eSIM), влагозащита IP68", new BigDecimal(1100), "galaxym53.jpg", "cars"));

        }
        if ("camera".equalsIgnoreCase(category)) {
            return List.of(new Product(12, "Iphone 14", "Apple iOS, экран 6.1\" OLED (1170x2532) 60 Гц, Apple A15 Bionic, ОЗУ 6 ГБ, память 128 ГБ, камера 12 Мп, 1 SIM (nano-SIM/eSIM), влагозащита IP68", new BigDecimal(1300), "iphone14.png", "camera"),
                           new Product(13, "Samsung Galaxy M53 5G", "Android 12, Super AMOLED Plus 120 Гц, 6,7 дюйма, 1080 х 2408, 20:9, MediaTek MT6877 Dimensity 900, ОЗУ 8 ГБ, память 128 ГБ, камера 12 Мп, 1 SIM (nano-SIM/eSIM), влагозащита IP68", new BigDecimal(1100), "galaxym13.jpg", "camera"),
                           new Product(13, "Samsung Galaxy M53 5G", "Android 12, Super AMOLED Plus 120 Гц, 6,7 дюйма, 1080 х 2408, 20:9, MediaTek MT6877 Dimensity 900, ОЗУ 8 ГБ, память 128 ГБ, камера 12 Мп, 1 SIM (nano-SIM/eSIM), влагозащита IP68", new BigDecimal(1100), "galaxym53.jpg", "camera"),
                           new Product(14, "Samsung Galaxy M53 5G", "Android 12, Super AMOLED Plus 120 Гц, 6,7 дюйма, 1080 х 2408, 20:9, MediaTek MT6877 Dimensity 900, ОЗУ 8 ГБ, память 128 ГБ, камера 12 Мп, 1 SIM (nano-SIM/eSIM), влагозащита IP68", new BigDecimal(1100), "galaxym53.jpg", "camera"),
                           new Product(14, "Samsung Galaxy M53 5G", "Android 12, Super AMOLED Plus 120 Гц, 6,7 дюйма, 1080 х 2408, 20:9, MediaTek MT6877 Dimensity 900, ОЗУ 8 ГБ, память 128 ГБ, камера 12 Мп, 1 SIM (nano-SIM/eSIM), влагозащита IP68", new BigDecimal(1100), "galaxym53.jpg", "camera"),
                           new Product(14, "Samsung Galaxy M53 5G", "Android 12, Super AMOLED Plus 120 Гц, 6,7 дюйма, 1080 х 2408, 20:9, MediaTek MT6877 Dimensity 900, ОЗУ 8 ГБ, память 128 ГБ, камера 12 Мп, 1 SIM (nano-SIM/eSIM), влагозащита IP68", new BigDecimal(1100), "galaxym53.jpg", "camera"),
                           new Product(14, "Samsung Galaxy M53 5G", "Android 12, Super AMOLED Plus 120 Гц, 6,7 дюйма, 1080 х 2408, 20:9, MediaTek MT6877 Dimensity 900, ОЗУ 8 ГБ, память 128 ГБ, камера 12 Мп, 1 SIM (nano-SIM/eSIM), влагозащита IP68", new BigDecimal(1100), "galaxym53.jpg", "camera"));
        }
        return null;
    }
}