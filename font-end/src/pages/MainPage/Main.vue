<script>
console.log("页面可以被加载")
export default {

}
</script>

<template>
  <div class="content">


    <!-- 卡片区 -->
    <div class="card-wrap">
      <div class="card gradient-bg">
        <div class="card-title">
          <h3>前端焕新</h3>
          <br>
          <p>采用Vue3.5：拥抱新特性</p>
          <br>
          <p>整合Vue-router：权限鉴定</p>
          <br>
          <p>Vite构建：解决跨域</p>
          <br>

        </div>
      </div>
      <div class="card gradient-bg">
        <div class="card-title">
          <h3>后台优化</h3>
          <br>
          <p>选型SpringBoot：高效开发</p>
          <br>
          <p>整合MybatisPlus：赋能效率</p>
          <br>
          <p>采取三层架构：致敬经典</p>
          <br>
        </div>
      </div>
      <div class="card gradient-bg">
        <div class="card-title">
          <h3>功能优化</h3>
          <br>
          <p>员工系统：个性查询</p>
          <br>
          <p>管理菜单：任意修订</p>
          <br>
          <p>博客畅享：展露个性</p>
          <br>
        </div>
      </div>
      <div class="card gradient-bg">
        <div class="card-title">
          <h3>开箱即用</h3>
          <br>
          <p>前端封装：简单易懂</p>
          <br>
          <p>后端设计：文档全面</p>
          <br>
          <p>版本迭代：即刻进行</p>
          <br>
        </div>
      </div>
    </div>
    <div class="announcement">
      <strong>最新公告:</strong>
      <p>23计科六班-肖永财-2314020106</p>
      <p>技术栈：</p>
      <p>前端：Vue3+Vite</p>
      <p>后端：SpringBoot/Mybatis-plus/MySQL</p>

    </div>
  </div>
</template>

<style scoped>
/* 基本重置 */
* {
  margin: 0;
  padding: 0;
  box-sizing: border-box;
}

body {
  font-family: -apple-system, BlinkMacSystemFont, "Segoe UI", "Roboto", "Oxygen", "Ubuntu", "Cantarell", "Fira Sans", "Droid Sans", "Helvetica Neue", sans-serif;
  background-color: #f4f4f4; /* 浅灰色背景 */
  color: #333; /* 字体颜色设置为深灰 */
}
.card-wrap{
  display: flex;
  flex-wrap: wrap;
  gap: 20px;
  justify-content: center;
  height: 100px;
}
/* 内容部分 */


/* 公告区 */
.announcement {
  width: 100%;

  padding: 20px;
  margin-bottom: 200px;
  text-align: center;
  font-size: 18px;
  background: lightgrey;
  box-shadow: rgba(50, 50, 93, 0.25) 0px 30px 50px -12px inset, rgba(0, 0, 0, 0.3) 0px 18px 26px -18px inset;
  border-radius: 50px;
}

/* From www.lingdaima.com */
.card {
  color:white;
  display: flex;
  flex-direction: column;
  align-items: center;
  justify-content: space-around;
  width: 260px;
  padding: 20px 1px;
  margin: 10px 0;
  text-align: center;
  position: relative;
  cursor: pointer;
  box-shadow: 0 10px 15px -3px rgba(33,150,243,.4),0 4px 6px -4px rgba(33,150,243,.4);
  border-radius: 10px;
  background-color: #6B6ECC;
  background: linear-gradient(45deg, #04051dea 0%, #2b566e 100%);
}

.card:hover {
  box-shadow: -12px 12px 2px -1px rgba(0, 0, 255, .2);
}





/* 页脚样式 */
footer {
  background-color: #333;
  color: white;
  padding: 20px 0;
  text-align: center;
  font-size: 14px;
}

footer a {
  color: #0070c9;
  text-decoration: none;
  transition: color 0.3s;
}

footer a:hover {
  color: #0056b3; /* 页脚链接的悬浮效果 */
}



</style>