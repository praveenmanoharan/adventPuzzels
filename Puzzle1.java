public class Puzzle1 {

    public static void main(String args[]) {

        final int[] input1 = { 1721, 979, 366, 299, 675, 1456 };

        final int[] input2 = { 1711, 1924, 1384, 1590, 1876, 1918, 2003, 1514, 1608, 1984, 1706, 1375, 1476, 1909, 1615,
                1879, 1940, 1945, 1899, 1510, 1657, 1685, 1588, 1884, 1864, 1995, 1648, 1713, 1532, 1556, 1572, 1667,
                1861, 1773, 1501, 1564, 1756, 395, 1585, 1717, 1553, 1487, 1617, 1808, 1780, 1570, 1881, 1992, 1894,
                1772, 1837, 2002, 1659, 1731, 1873, 1760, 552, 1575, 1597, 1986, 1416, 1398, 1737, 1027, 1457, 198,
                1904, 1753, 1727, 633, 1577, 1944, 1369, 1400, 1843, 1966, 1008, 1681, 1890, 1939, 1605, 1548, 1953,
                1839, 1409, 1592, 1744, 1761, 1613, 1412, 1759, 703, 1498, 1941, 1425, 1528, 1469, 1728, 1447, 1406,
                1797, 1543, 1682, 1722, 1723, 1893, 1644, 796, 1505, 1715, 1729, 1943, 1626, 1602, 1964, 1509, 1816,
                1660, 1399, 1996, 1750, 1701, 1963, 1979, 1558, 1506, 1465, 2001, 1935, 1616, 1990, 1946, 1818, 1892,
                1431, 1832, 1688, 2004, 1424, 1716, 1897, 1931, 1557, 1389, 1872, 1640, 1670, 1911, 1427, 1730, 211,
                1420, 1488, 1689, 1383, 1967, 1594, 642, 1622, 1627, 1607, 1372, 1596, 1451, 1693, 1380, 1745, 1908,
                1785, 1646, 1824, 1418, 1258, 1664, 1631, 1459, 1901, 1838, 1794, 1815, 1388, 1809, 1920, 1411, 1593,
                1676, 1610, 1629, 1512, 1522, 1649, 1740, 1695, 1504, 1856, 1791, 1898, 1661, 1806, 1851 };

        final int sum = 2020;

        Puzzle1 puzzle1 = new Puzzle1();
        System.out.println(puzzle1.getExpenseDetail1(input1, sum));
        System.out.println(puzzle1.getExpenseDetail2(input1, sum));

        System.out.println(puzzle1.getExpenseDetail1(input2, sum));
        System.out.println(puzzle1.getExpenseDetail2(input2, sum));
    }   

    public int getExpenseDetail1(int[] input, int sum) {
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input.length; j++) {
                if (input[j] + input[i] == sum) {
                    int output = input[j] * input[i];
                    System.out.println("val1 :: " + input[i]);
                    System.out.println("val2 :: " + input[j]);
                    System.out.println("Expense val :: " + output);
                    return  output;
                }
            }
        }
        return 0;
    }

    public int getExpenseDetail2(int[] input, int sum) {
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input.length; j++) {
                for (int k = 0; k < input.length; k++) {
                    if (input[j] + input[i] + input[k] == sum) {
                        int output = input[j] * input[i] * input[k];
                        System.out.println("val1 :: " + input[i]);
                        System.out.println("val2 :: " + input[j]);
                        System.out.println("val3 :: " + input[k]);
                        System.out.println("Expense val :: " + output);
                        return  output;
                    }
                }
            }
        }
        return 0;
    }
}
