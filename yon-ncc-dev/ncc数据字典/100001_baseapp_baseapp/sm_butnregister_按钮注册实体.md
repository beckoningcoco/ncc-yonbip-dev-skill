# |<<

**按钮注册实体 (sm_butnregister / nc.vo.sm.funcreg.ButtonRegVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5295.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_btn | 主键 | pk_btn | char(20) | √ | 主键 (UFID) |
| 2 | btncode | 按钮编码 | btncode | varchar(50) |  | 字符串 (String) |
| 3 | btnname | 按钮名称 | btnname | varchar(50) |  | 字符串 (String) |
| 4 | isenable | 按钮是否启用 | isenable | char(1) |  | 布尔类型 (UFBoolean) |
| 5 | isbuttonpower | 是否启用权限 | isbuttonpower | char(1) |  | 布尔类型 (UFBoolean) |
| 6 | btndesc | 按钮功能描述 | btndesc | varchar(200) |  | 字符串 (String) |
| 7 | btnownertype | 按钮所属类型 | btnownertype | int |  | 按钮所属关系枚举 (btnowninfoenum) |  | 0=节点按钮; |