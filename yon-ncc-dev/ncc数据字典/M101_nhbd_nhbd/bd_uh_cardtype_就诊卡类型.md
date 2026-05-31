# |<<

**就诊卡类型 (bd_uh_cardtype / nc.vo.nhbd.pati.PVCardTypeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1018.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_cardtype | 卡类型主键 | pk_cardtype | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | code | 类型编码 | code | varchar(30) | √ | 字符串 (String) |
| 5 | name | 类型名称 | name | varchar(50) | √ | 字符串 (String) |
| 6 | cardformat | 编码格式规则 | cardformat | varchar(30) |  | 字符串 (String) |
| 7 | genetype | 卡号生成方式 | genetype | varchar(50) |  | 卡号生成方式 (PvcardtypeEnum) |  | 0=系统生成; |