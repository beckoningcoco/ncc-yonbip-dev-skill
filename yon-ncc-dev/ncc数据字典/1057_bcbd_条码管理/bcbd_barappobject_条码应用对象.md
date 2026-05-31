# |<<

**条码应用对象 (bcbd_barappobject / nc.vo.bcbd.barappobject.BarAppObjectVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/255.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_barappobject | 条码对象主键 | pk_barappobject | char(20) | √ | 主键 (UFID) |
| 2 | code | 条码对象编码 | code | varchar(50) |  | 字符串 (String) |
| 3 | name | 条码对象名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 4 | mdclassid | 应用对象实体 | mdclassid | varchar(36) |  | 实体 (entity) |
| 5 | memo | 备注 | memo | varchar(200) |  | 备注 (Memo) |
| 6 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 7 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 8 | dataoriginflag | 分布式 | dataoriginflag | varchar(50) |  | 数据来源 (dataorigin) |  | 0=本级产生; |