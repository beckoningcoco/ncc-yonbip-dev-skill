# |<<

**应用按钮注册实体 (sm_app_button / nc.vo.platform.workbench.App_ButtonVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5273.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | btncode | 按钮编码 | btncode | varchar(50) |  | 字符串 (String) |
| 2 | btnname | 按钮名称 | btnname | varchar(50) |  | 字符串 (String) |
| 3 | btndesc | 按钮功能描述 | btndesc | varchar(200) |  | 字符串 (String) |
| 4 | resid | 多语标识 | resid | varchar(100) |  | 字符串 (String) |
| 5 | appid | 应用id | appid | varchar(50) |  | 字符串 (String) |
| 6 | iskeyfunc | 是否关键功能 | iskeyfunc | char(1) |  | 布尔类型 (UFBoolean) |
| 7 | keyboard | 快捷键 | keyboard | varchar(50) |  | 字符串 (String) |
| 8 | btnorder | 按钮顺序 | btnorder | int |  | 整数 (Integer) |