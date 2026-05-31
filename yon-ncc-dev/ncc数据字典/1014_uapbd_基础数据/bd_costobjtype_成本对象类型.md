# |<<

**成本对象类型 (bd_costobjtype / nc.vo.bd.costobjtype.entity.CostObjTypeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/412.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | ccostobjtypeid | 成本对象类型 | ccostobjtypeid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | vcbcode | 编码 | vcbcode | varchar(40) |  | 字符串 (String) |
| 4 | vcbname | 名称 | vcbname | varchar(200) |  | 多语文本 (MultiLangText) |
| 5 | bmaterial | 是否产品 | bmaterial | char(1) |  | 布尔类型 (UFBoolean) |
| 6 | bmo | 是否生产订单 | bmo | char(1) |  | 布尔类型 (UFBoolean) |
| 7 | bbatch | 是否批次 | bbatch | char(1) |  | 布尔类型 (UFBoolean) |
| 8 | bcostclass | 是否成本分类 | bcostclass | char(1) |  | 布尔类型 (UFBoolean) |
| 9 | bproject | 是否项目 | bproject | char(1) |  | 布尔类型 (UFBoolean) |