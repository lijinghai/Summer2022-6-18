<!--
 * @author lijinghai
 * @email lijinghailjh@163.com
 * @Description:
 * @date 2022/8/4 18:13
 * @Version: v1.0
-->
<template>
  <el-tree :data="menus" :props="defaultProps" :expand-on-click-node="false" show-checkbox node-key="catId">
    <span class="custom-tree-node" slot-scope="{ node, data }">
        <span>{{ node.label }}</span>
        <span>
          <el-button
            v-if="node.level <=2"
            type="text"
            size="mini"
            @click="() => append(data)"
          >Append</el-button>

          <el-button
            type="text"
            size="mini"
            @click="edit(data)"
          >edit</el-button>

          <el-button
            v-if="node.childNodes.length==0"
            type="text"
            size="mini"
            @click="() => remove(node, data)"
          >Delete</el-button>
        </span>
      </span>
  </el-tree>
</template>

<script>
// 这里可以导入其他文件（比如：组件，工具js，第三方插件js，json文件，图片文件等等）
// 例如：import 《组件名称》 from '《组件路径》';
export default {
  name: 'category',
// import引入的组件需要注入到对象中才能使用
  components: {},
  // 这里存放数据
  data () {
    return {
      menus: [],
      defaultProps: {
        children: 'children',
        label: 'name'
      }
    }
  },
// 监听属性 类似于data概念
  computed: {},
// 监控data中的数据变化
  watch: {},
// 方法集合
  methods: {
    // 获取数据
    getMenus () {
      this.$http({
        url: this.$http.adornUrl('/product/category/list/tree'),
        method: 'get'
      }).then(({data}) => {
        console.log('成功获取到菜单数据', data.data)
        this.menus = data.data
      })
    },
    // 点击按钮
    append (data) {
      console.log('append', data)
    },
    // 移除按钮
    remove (node, data) {
      console.log('remove', node, data)
    },
    // 编辑
    edit (data) {
      console.log('edit', data)
    }
  },
// 生命周期 - 创建完成（可以访问当前this实例）
  created () {
    this.getMenus()
  },
// 生命周期 - 挂载完成（可以访问DOM元素）
  mounted () {

  },
  // 生命周期 - 创建之前
  beforeCreate () {
  },
  // 生命周期 - 挂载之前
  beforeMount () {
  },
  // 生命周期 - 更新之前
  beforeUpdate () {
  },
  // 生命周期 - 更新之后
  updated () {
  },
  // 生命周期 - 销毁之前
  beforeDestroy () {
  },
  // 生命周期 - 销毁完成
  destroyed () {
  },
  // 如果页面有keep-alive缓存功能，这个函数会触发
  activated () {
  }
}
</script>
<style scoped>
/*引入公共css类 @import url();*/

</style>
