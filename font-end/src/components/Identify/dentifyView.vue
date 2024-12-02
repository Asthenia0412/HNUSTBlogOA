<template>
  <div class="login-form">


      <input
          placeholder="请输入验证码"
          v-model="formLogin.code"
      ></input
      >

        <div class="login-code" width="100%" @click="refreshCode">
          <!--验证码组件-->
          <dentify :identifyCode="identifyCode"></dentify></div
        >

    <div><button @click="submit">提交</button></div>
  </div>
</template>

<script>
import dentify from "./dentify.vue";
export default {
  name: "HomeView",
  components: {
    dentify,
  },
  data() {
    return {
      // 表单提交内容
      formLogin: {
        code: "", //验证码输入框
      },
      identifyCodes: "1234567890abcdefjhijklinopqrsduvwxyz", //随机串内容,从这里随机抽几个显示验证码
      identifyCode: "", //验证码图片内容
    };
  },
  mounted() {
    // 初始化验证码
    this.identifyCode = "";
    //参数：（1）随机串内容。（2）验证码显示位数
    this.makeCode(this.identifyCodes, 4);
  },
  methods: {
    // 重置验证码
    refreshCode() {
      this.identifyCode = "";
      this.makeCode(this.identifyCodes, 4);
    },
    //获取验证码的值
    makeCode(o, l) {
      for (let i = 0; i < l; i++) {
        //通过循环获取字符串内随机几位
        this.identifyCode +=
            this.identifyCodes[this.randomNum(0, this.identifyCodes.length)];
      }
    },
    //随机数字：用于当角标拿字符串的值
    randomNum(min, max) {
      return Math.floor(Math.random() * (max - min) + min);
    },
    submit() {
      console.log("验证码:", this.identifyCode);
      console.log("用户输入的验证码:",this.formLogin.code);
      console.log('是否验证通过:',this.identifyCode==this.formLogin.code);
    },
  },
};
</script>
<style scoped>
/* 全局样式修正 */
body {
  font-family: 'San Francisco', 'Arial', sans-serif; /* 使用Apple的字体 */
  margin: 0;
  padding: 0;
  display: flex;
  flex-direction: column;
  justify-content: center; /* 中心对齐 */
  align-items: center;
  min-height: 100vh;
  background-color: #f2f2f2; /* 使用灰色背景 */
  color: #333; /* 文字颜色为深灰色 */
}

/* 登录表单样式修正 */
.login-form {
  width: 100%;
  max-width: 600px;
  padding: 40px; /* 增加内边距 */
  box-sizing: border-box;
  font-size: 30px;
  margin-top: 0;
  border-radius: 50px;
  box-shadow: 0 4px 8px rgba(0, 0, 0, 0.8);
  background-color: #fff; /* 使用白色背景 */
  height: 400px;
}

/* 卡片布局样式 */
.card {
  display: flex;
  flex-direction: column;
  align-items: center;
  padding: 20px;
  border-radius: 10px;
  background-color: #fff;
  box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
  transition: transform 0.3s ease, box-shadow 0.3s ease;
}

.card:hover {
  transform: translateY(-10px); /* 浮动效果加强 */
  box-shadow: 0 6px 12px rgba(0, 0, 0, 0.2);
}

/* 表单元素样式 */
.form-group {
  width: 100%;
  margin-bottom: 20px;

}

input {
  width: 100%;
  padding: 12px;
  margin-top: 5px;
  border: 1px solid #ccc;
  border-radius: 4px;
  box-sizing: border-box;
  font-size: 16px;
}

button {
  width: 100%;
  padding: 12px;
  background-color: #000; /* 使用黑色 */
  color: #fff;
  border: none;
  border-radius: 4px;
  cursor: pointer;
  font-size: 16px;
  transition: background-color 0.3s ease;
}

button:hover {
  background-color: #333; /* 悬浮时变暗 */
}

input:focus {
  border-color: #000; /* 聚焦时边框变黑 */
  outline: none;
}

label {
  font-size: 20px;
  color: #333;
  margin-bottom: 5px;
  display: block;
}

/* 网格布局样式 */
.grid-container {
  display: grid;
  grid-template-columns: repeat(3, 1fr);
  gap: 20px;
  padding: 20px;
  max-width: 1000px;
  background-color: #fff;
  border-radius: 10px;
  box-shadow: 0 4px 8px rgba(0, 0, 0, 0.1);
}

.grid-item {
  display: flex;
  flex-direction: column;
  align-items: center;
  background-color: #fff;
  border-radius: 10px;
  padding: 15px;
  text-align: center;
  box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1);
  transition: transform 0.3s ease, box-shadow 0.3s ease;
}

.grid-item:hover {
  transform: translateY(-5px);
  box-shadow: 0 6px 15px rgba(0, 0, 0, 0.15);
}

.avatar {
  width: 80px;
  height: 80px;
  border-radius: 50%;
  margin-bottom: 10px;
  object-fit: cover;
}

.username {
  font-size: 1.2em;
  font-weight: bold;
  color: #333;
  margin-bottom: 10px;
}

.bio {
  font-size: 1em;
  color: #666;
  margin-top: 10px;
}

/* 响应式样式 */
@media (max-width: 768px) {
  .grid-container {
    grid-template-columns: repeat(2, 1fr);
  }
}

@media (max-width: 480px) {
  .grid-container {
    grid-template-columns: 1fr;
  }

  .login-form {
    max-width: 90%;

  }
}

</style>
