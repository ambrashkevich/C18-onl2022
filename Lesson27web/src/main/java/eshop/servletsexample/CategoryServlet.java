package eshop.servletsexample;

import eshop.models.Product;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;

@WebServlet("/category")
public class CategoryServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String category = req.getParameter("name");
        List<Product> products = getProducts(category);
        System.out.println(products.toString());
        req.getSession().setAttribute("products", products);
        resp.sendRedirect("products.jsp");
//        req.getRequestDispatcher("/products.jsp").forward(req, resp);
    }

    public List<Product> getProducts(String category) {
        if (category.equalsIgnoreCase("Mobile phones")) {
            return List.of(new Product(12, "Iphone 14", "Apple iOS, экран 6.1\" OLED (1170x2532) 60 Гц, Apple A15 Bionic, ОЗУ 6 ГБ, память 128 ГБ, камера 12 Мп, 1 SIM (nano-SIM/eSIM), влагозащита IP68", new BigDecimal(1300), "iphone14.png"),
                    new Product(13, "Samsung Galaxy M53 5G", "Android 12, Super AMOLED Plus 120 Гц, 6,7 дюйма, 1080 х 2408, 20:9, MediaTek MT6877 Dimensity 900, ОЗУ 8 ГБ, память 128 ГБ, камера 12 Мп, 1 SIM (nano-SIM/eSIM), влагозащита IP68", new BigDecimal(1100), "galaxym13.jpg"),
                    new Product(13, "Samsung Galaxy M53 5G", "Android 12, Super AMOLED Plus 120 Гц, 6,7 дюйма, 1080 х 2408, 20:9, MediaTek MT6877 Dimensity 900, ОЗУ 8 ГБ, память 128 ГБ, камера 12 Мп, 1 SIM (nano-SIM/eSIM), влагозащита IP68", new BigDecimal(1100), "galaxym53.jpg"),
                    new Product(14, "Samsung Galaxy M53 5G", "Android 12, Super AMOLED Plus 120 Гц, 6,7 дюйма, 1080 х 2408, 20:9, MediaTek MT6877 Dimensity 900, ОЗУ 8 ГБ, память 128 ГБ, камера 12 Мп, 1 SIM (nano-SIM/eSIM), влагозащита IP68", new BigDecimal(1100), "iphone11.jpeg"),
                    new Product(14, "Samsung Galaxy M53 5G", "Android 12, Super AMOLED Plus 120 Гц, 6,7 дюйма, 1080 х 2408, 20:9, MediaTek MT6877 Dimensity 900, ОЗУ 8 ГБ, память 128 ГБ, камера 12 Мп, 1 SIM (nano-SIM/eSIM), влагозащита IP68", new BigDecimal(1100), "iphone14pro.jpeg"),
                    new Product(14, "Samsung Galaxy M53 5G", "Android 12, Super AMOLED Plus 120 Гц, 6,7 дюйма, 1080 х 2408, 20:9, MediaTek MT6877 Dimensity 900, ОЗУ 8 ГБ, память 128 ГБ, камера 12 Мп, 1 SIM (nano-SIM/eSIM), влагозащита IP68", new BigDecimal(1100), "galaxym53.jpg"));

        }
        if (category.equalsIgnoreCase("Laptops")) {
            return List.of(new Product(12, "Iphone 14", "Apple iOS, экран 6.1\" OLED (1170x2532) 60 Гц, Apple A15 Bionic, ОЗУ 6 ГБ, память 128 ГБ, камера 12 Мп, 1 SIM (nano-SIM/eSIM), влагозащита IP68", new BigDecimal(1300), "iphone14.png"),
                    new Product(13, "Samsung Galaxy M53 5G", "Android 12, Super AMOLED Plus 120 Гц, 6,7 дюйма, 1080 х 2408, 20:9, MediaTek MT6877 Dimensity 900, ОЗУ 8 ГБ, память 128 ГБ, камера 12 Мп, 1 SIM (nano-SIM/eSIM), влагозащита IP68", new BigDecimal(1100), "galaxym13.jpg"),
                    new Product(13, "Samsung Galaxy M53 5G", "Android 12, Super AMOLED Plus 120 Гц, 6,7 дюйма, 1080 х 2408, 20:9, MediaTek MT6877 Dimensity 900, ОЗУ 8 ГБ, память 128 ГБ, камера 12 Мп, 1 SIM (nano-SIM/eSIM), влагозащита IP68", new BigDecimal(1100), "galaxym53.jpg"),
                    new Product(14, "Samsung Galaxy M53 5G", "Android 12, Super AMOLED Plus 120 Гц, 6,7 дюйма, 1080 х 2408, 20:9, MediaTek MT6877 Dimensity 900, ОЗУ 8 ГБ, память 128 ГБ, камера 12 Мп, 1 SIM (nano-SIM/eSIM), влагозащита IP68", new BigDecimal(1100), "galaxym53.jpg"),
                    new Product(14, "Samsung Galaxy M53 5G", "Android 12, Super AMOLED Plus 120 Гц, 6,7 дюйма, 1080 х 2408, 20:9, MediaTek MT6877 Dimensity 900, ОЗУ 8 ГБ, память 128 ГБ, камера 12 Мп, 1 SIM (nano-SIM/eSIM), влагозащита IP68", new BigDecimal(1100), "galaxym53.jpg"),
                    new Product(14, "Samsung Galaxy M53 5G", "Android 12, Super AMOLED Plus 120 Гц, 6,7 дюйма, 1080 х 2408, 20:9, MediaTek MT6877 Dimensity 900, ОЗУ 8 ГБ, память 128 ГБ, камера 12 Мп, 1 SIM (nano-SIM/eSIM), влагозащита IP68", new BigDecimal(1100), "galaxym53.jpg"),
                    new Product(14, "Samsung Galaxy M53 5G", "Android 12, Super AMOLED Plus 120 Гц, 6,7 дюйма, 1080 х 2408, 20:9, MediaTek MT6877 Dimensity 900, ОЗУ 8 ГБ, память 128 ГБ, камера 12 Мп, 1 SIM (nano-SIM/eSIM), влагозащита IP68", new BigDecimal(1100), "galaxym53.jpg"));


        }
        if (category.equalsIgnoreCase("jpsNavigators")) {
            return List.of(new Product(12, "Iphone 14", "Apple iOS, экран 6.1\" OLED (1170x2532) 60 Гц, Apple A15 Bionic, ОЗУ 6 ГБ, память 128 ГБ, камера 12 Мп, 1 SIM (nano-SIM/eSIM), влагозащита IP68", new BigDecimal(1300), "iphone14.png"),
                    new Product(13, "Samsung Galaxy M53 5G", "Android 12, Super AMOLED Plus 120 Гц, 6,7 дюйма, 1080 х 2408, 20:9, MediaTek MT6877 Dimensity 900, ОЗУ 8 ГБ, память 128 ГБ, камера 12 Мп, 1 SIM (nano-SIM/eSIM), влагозащита IP68", new BigDecimal(1100), "galaxym13.jpg"),
                    new Product(13, "Samsung Galaxy M53 5G", "Android 12, Super AMOLED Plus 120 Гц, 6,7 дюйма, 1080 х 2408, 20:9, MediaTek MT6877 Dimensity 900, ОЗУ 8 ГБ, память 128 ГБ, камера 12 Мп, 1 SIM (nano-SIM/eSIM), влагозащита IP68", new BigDecimal(1100), "galaxym53.jpg"),
                    new Product(14, "Samsung Galaxy M53 5G", "Android 12, Super AMOLED Plus 120 Гц, 6,7 дюйма, 1080 х 2408, 20:9, MediaTek MT6877 Dimensity 900, ОЗУ 8 ГБ, память 128 ГБ, камера 12 Мп, 1 SIM (nano-SIM/eSIM), влагозащита IP68", new BigDecimal(1100), "galaxym53.jpg"),
                    new Product(14, "Samsung Galaxy M53 5G", "Android 12, Super AMOLED Plus 120 Гц, 6,7 дюйма, 1080 х 2408, 20:9, MediaTek MT6877 Dimensity 900, ОЗУ 8 ГБ, память 128 ГБ, камера 12 Мп, 1 SIM (nano-SIM/eSIM), влагозащита IP68", new BigDecimal(1100), "galaxym53.jpg"),
                    new Product(14, "Samsung Galaxy M53 5G", "Android 12, Super AMOLED Plus 120 Гц, 6,7 дюйма, 1080 х 2408, 20:9, MediaTek MT6877 Dimensity 900, ОЗУ 8 ГБ, память 128 ГБ, камера 12 Мп, 1 SIM (nano-SIM/eSIM), влагозащита IP68", new BigDecimal(1100), "galaxym53.jpg"),
                    new Product(14, "Samsung Galaxy M53 5G", "Android 12, Super AMOLED Plus 120 Гц, 6,7 дюйма, 1080 х 2408, 20:9, MediaTek MT6877 Dimensity 900, ОЗУ 8 ГБ, память 128 ГБ, камера 12 Мп, 1 SIM (nano-SIM/eSIM), влагозащита IP68", new BigDecimal(1100), "galaxym53.jpg"));


        }
        if (category.equalsIgnoreCase("fridges")) {
            return List.of(new Product(12, "Iphone 14", "Apple iOS, экран 6.1\" OLED (1170x2532) 60 Гц, Apple A15 Bionic, ОЗУ 6 ГБ, память 128 ГБ, камера 12 Мп, 1 SIM (nano-SIM/eSIM), влагозащита IP68", new BigDecimal(1300), "iphone14.png"),
                    new Product(13, "Samsung Galaxy M53 5G", "Android 12, Super AMOLED Plus 120 Гц, 6,7 дюйма, 1080 х 2408, 20:9, MediaTek MT6877 Dimensity 900, ОЗУ 8 ГБ, память 128 ГБ, камера 12 Мп, 1 SIM (nano-SIM/eSIM), влагозащита IP68", new BigDecimal(1100), "galaxym13.jpg"),
                    new Product(13, "Samsung Galaxy M53 5G", "Android 12, Super AMOLED Plus 120 Гц, 6,7 дюйма, 1080 х 2408, 20:9, MediaTek MT6877 Dimensity 900, ОЗУ 8 ГБ, память 128 ГБ, камера 12 Мп, 1 SIM (nano-SIM/eSIM), влагозащита IP68", new BigDecimal(1100), "galaxym53.jpg"),
                    new Product(14, "Samsung Galaxy M53 5G", "Android 12, Super AMOLED Plus 120 Гц, 6,7 дюйма, 1080 х 2408, 20:9, MediaTek MT6877 Dimensity 900, ОЗУ 8 ГБ, память 128 ГБ, камера 12 Мп, 1 SIM (nano-SIM/eSIM), влагозащита IP68", new BigDecimal(1100), "galaxym53.jpg"),
                    new Product(14, "Samsung Galaxy M53 5G", "Android 12, Super AMOLED Plus 120 Гц, 6,7 дюйма, 1080 х 2408, 20:9, MediaTek MT6877 Dimensity 900, ОЗУ 8 ГБ, память 128 ГБ, камера 12 Мп, 1 SIM (nano-SIM/eSIM), влагозащита IP68", new BigDecimal(1100), "galaxym53.jpg"),
                    new Product(14, "Samsung Galaxy M53 5G", "Android 12, Super AMOLED Plus 120 Гц, 6,7 дюйма, 1080 х 2408, 20:9, MediaTek MT6877 Dimensity 900, ОЗУ 8 ГБ, память 128 ГБ, камера 12 Мп, 1 SIM (nano-SIM/eSIM), влагозащита IP68", new BigDecimal(1100), "galaxym53.jpg"),
                    new Product(14, "Samsung Galaxy M53 5G", "Android 12, Super AMOLED Plus 120 Гц, 6,7 дюйма, 1080 х 2408, 20:9, MediaTek MT6877 Dimensity 900, ОЗУ 8 ГБ, память 128 ГБ, камера 12 Мп, 1 SIM (nano-SIM/eSIM), влагозащита IP68", new BigDecimal(1100), "galaxym53.jpg"));


        }
        if (category.equalsIgnoreCase("car")) {
            return List.of(new Product(12, "Iphone 14", "Apple iOS, экран 6.1\" OLED (1170x2532) 60 Гц, Apple A15 Bionic, ОЗУ 6 ГБ, память 128 ГБ, камера 12 Мп, 1 SIM (nano-SIM/eSIM), влагозащита IP68", new BigDecimal(1300), "iphone14.png"),
                    new Product(13, "Samsung Galaxy M53 5G", "Android 12, Super AMOLED Plus 120 Гц, 6,7 дюйма, 1080 х 2408, 20:9, MediaTek MT6877 Dimensity 900, ОЗУ 8 ГБ, память 128 ГБ, камера 12 Мп, 1 SIM (nano-SIM/eSIM), влагозащита IP68", new BigDecimal(1100), "galaxym13.jpg"),
                    new Product(13, "Samsung Galaxy M53 5G", "Android 12, Super AMOLED Plus 120 Гц, 6,7 дюйма, 1080 х 2408, 20:9, MediaTek MT6877 Dimensity 900, ОЗУ 8 ГБ, память 128 ГБ, камера 12 Мп, 1 SIM (nano-SIM/eSIM), влагозащита IP68", new BigDecimal(1100), "galaxym53.jpg"),
                    new Product(14, "Samsung Galaxy M53 5G", "Android 12, Super AMOLED Plus 120 Гц, 6,7 дюйма, 1080 х 2408, 20:9, MediaTek MT6877 Dimensity 900, ОЗУ 8 ГБ, память 128 ГБ, камера 12 Мп, 1 SIM (nano-SIM/eSIM), влагозащита IP68", new BigDecimal(1100), "galaxym53.jpg"),
                    new Product(14, "Samsung Galaxy M53 5G", "Android 12, Super AMOLED Plus 120 Гц, 6,7 дюйма, 1080 х 2408, 20:9, MediaTek MT6877 Dimensity 90, ОЗУ 8 ГБ, память 128 ГБ, камера 12 Мп, 1 SIM (nano-SIM/eSIM), влагозащита IP68", new BigDecimal(1100), "galaxym53.jpg"),
                    new Product(14, "Samsung Galaxy M53 5G", "Android 12, Super AMOLED Plus 120 Гц, 6,7 дюйма, 1080 х 2408, 20:9, MediaTek MT6877 Dimensity 900, ОЗУ 8 ГБ, память 128 ГБ, камера 12 Мп, 1 SIM (nano-SIM/eSIM), влагозащита IP68", new BigDecimal(1100), "galaxym53.jpg"),
                    new Product(14, "Samsung Galaxy M53 5G", "Android 12, Super AMOLED Plus 120 Гц, 6,7 дюйма, 1080 х 2408, 20:9, MediaTek MT6877 Dimensity 900, ОЗУ 8 ГБ, память 128 ГБ, камера 12 Мп, 1 SIM (nano-SIM/eSIM), влагозащита IP68", new BigDecimal(1100), "galaxym53.jpg"));

        }
        if (category.equalsIgnoreCase("camera")) {
            return List.of(new Product(12, "Iphone 14", "Apple iOS, экран 6.1\" OLED (1170x2532) 60 Гц, Apple A15 Bionic, ОЗУ 6 ГБ, память 128 ГБ, камера 12 Мп, 1 SIM (nano-SIM/eSIM), влагозащита IP68", new BigDecimal(1300), "iphone14.png"),
                    new Product(13, "Samsung Galaxy M53 5G", "Android 12, Super AMOLED Plus 120 Гц, 6,7 дюйма, 1080 х 2408, 20:9, MediaTek MT6877 Dimensity 900, ОЗУ 8 ГБ, память 128 ГБ, камера 12 Мп, 1 SIM (nano-SIM/eSIM), влагозащита IP68", new BigDecimal(1100), "galaxym13.jpg"),
                    new Product(13, "Samsung Galaxy M53 5G", "Android 12, Super AMOLED Plus 120 Гц, 6,7 дюйма, 1080 х 2408, 20:9, MediaTek MT6877 Dimensity 900, ОЗУ 8 ГБ, память 128 ГБ, камера 12 Мп, 1 SIM (nano-SIM/eSIM), влагозащита IP68", new BigDecimal(1100), "galaxym53.jpg"),
                    new Product(14, "Samsung Galaxy M53 5G", "Android 12, Super AMOLED Plus 120 Гц, 6,7 дюйма, 1080 х 2408, 20:9, MediaTek MT6877 Dimensity 900, ОЗУ 8 ГБ, память 128 ГБ, камера 12 Мп, 1 SIM (nano-SIM/eSIM), влагозащита IP68", new BigDecimal(1100), "galaxym53.jpg"),
                    new Product(14, "Samsung Galaxy M53 5G", "Android 12, Super AMOLED Plus 120 Гц, 6,7 дюйма, 1080 х 2408, 20:9, MediaTek MT6877 Dimensity 900, ОЗУ 8 ГБ, память 128 ГБ, камера 12 Мп, 1 SIM (nano-SIM/eSIM), влагозащита IP68", new BigDecimal(1100), "galaxym53.jpg"),
                    new Product(14, "Samsung Galaxy M53 5G", "Android 12, Super AMOLED Plus 120 Гц, 6,7 дюйма, 1080 х 2408, 20:9, MediaTek MT6877 Dimensity 900, ОЗУ 8 ГБ, память 128 ГБ, камера 12 Мп, 1 SIM (nano-SIM/eSIM), влагозащита IP68", new BigDecimal(1100), "galaxym53.jpg"),
                    new Product(14, "Samsung Galaxy M53 5G", "Android 12, Super AMOLED Plus 120 Гц, 6,7 дюйма, 1080 х 2408, 20:9, MediaTek MT6877 Dimensity 900, ОЗУ 8 ГБ, память 128 ГБ, камера 12 Мп, 1 SIM (nano-SIM/eSIM), влагозащита IP68", new BigDecimal(1100), "galaxym53.jpg"));
        }
        return null;
    }
}
