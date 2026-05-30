# |<<

**页面按钮注册实体 (sm_appbutnregister / nc.vo.platform.workbench.AppButtonVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5278.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_btn | 主键 | pk_btn | char(20) | √ | 主键 (UFID) |
| 2 | btncode | 按钮编码 | btncode | varchar(50) |  | 字符串 (String) |
| 3 | btnname | 按钮名称 | btnname | varchar(50) |  | 字符串 (String) |
| 4 | btndesc | 按钮功能描述 | btndesc | varchar(200) |  | 字符串 (String) |
| 5 | resid | 多语标识 | resid | varchar(100) |  | 字符串 (String) |
| 6 | appid | 应用id | appid | varchar(50) |  | 字符串 (String) |
| 7 | isenable | 按钮是否启用 | isenable | char(1) |  | 布尔类型 (UFBoolean) |
| 8 | pagecode | 页面编码 | pagecode | varchar(50) |  | 字符串 (String) |
| 9 | btnorder | 按钮顺序 | btnorder | int |  | 整数 (Integer) |
| 10 | btntype | 按钮类型 | btntype | varchar(50) |  | 字符串 (String) |
| 11 | btnarea | 按钮区域 | btnarea | varchar(50) |  | 字符串 (String) |
| 12 | parent_code | 父按钮编码 | parent_code | varchar(50) |  | 字符串 (String) |
| 13 | iskeyfunc | 是否关键功能 | iskeyfunc | char(1) |  | 布尔类型 (UFBoolean) |
| 14 | keyboard | 快捷键 | keyboard | varchar(50) |  | 字符串 (String) |
| 15 | btncolor | 按钮颜色 | btncolor | varchar(50) |  | 字符串 (String) |
| 16 | pageareacode | 页面区域编码 | pageareacode | varchar(50) |  | 字符串 (String) |