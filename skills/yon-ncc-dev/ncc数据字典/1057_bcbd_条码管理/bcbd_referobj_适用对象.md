# |<<

**适用对象 (bcbd_referobj / nc.vo.bcbd.bartype.ReferObjVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/268.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_referobj | 适用对象主键 | pk_referobj | char(20) | √ | 主键 (UFID) |
| 2 | pk_bartype | 条码类型 | pk_bartype | varchar(20) |  | 条码类型 (bartype) |
| 3 | pk_referobjmd | 适用对象实体 | pk_referobjmd | varchar(36) |  | 实体 (entity) |
| 4 | memo | 备注 | memo | varchar(200) |  | 备注 (Memo) |
| 5 | name | 适用对象名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 6 | ispredata | 预置数据 | ispredata | char(1) |  | 布尔类型 (UFBoolean) |
| 7 | pk_billtype | 适用对象 | pk_billtype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 8 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 9 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 10 | modifier | 最后修改人 | modifier | varchar(20) |  | 用户 (user) |
| 11 | modifiedtime | 最后修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |