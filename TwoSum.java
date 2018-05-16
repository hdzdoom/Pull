 /**
     * 在一个数组里找到两个数相加等于target的对应的index
     * @param array
     * @param target
     * @return
     */
    private static int[] twoSum(int[] array, int target) {
        Map<Integer, Integer> map = new HashMap<>();


        for (int i = 0; i < array.length; i++) {
            int temp = target - array[i];
            if (map.containsKey(temp)) {
                return new int[]{map.get(temp)};
            }
            map.put(array[i], i);
        }
        throw new IllegalArgumentException("no such two sum");
    }
