# |<<

**应用模板分配基准表 (pub_app_systemplate / nc.vo.platform.appsystemplate.AppSystemplateVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4701.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_systemplate | 主键 | pk_systemplate | char(20) | √ | 主键 (UFID) |
| 2 | pagecode | 页面编码 | pagecode | varchar(50) | √ | 字符串 (String) |
| 3 | tempstyle | 模板类型 | tempstyle | varchar(50) | √ | 模板类型 (templatetypeenum) |  | 0=页面模板; |