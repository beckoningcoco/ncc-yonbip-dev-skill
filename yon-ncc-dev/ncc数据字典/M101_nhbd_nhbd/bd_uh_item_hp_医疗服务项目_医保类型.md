# |<<

**医疗服务项目_医保类型 (bd_uh_item_hp / com.yonyou.nhis.bd.pub2.item.vo.ItemHpVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1052.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_itemhp | 服务医保类型主键 | pk_itemhp | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | char(20) |  | 主键 (UFID) |
| 3 | pk_org | 所属机构 | pk_org | char(20) |  | 主键 (UFID) |
| 4 | pk_item | 服务项目主键 | pk_item | char(20) |  | 主键 (UFID) |
| 5 | pk_hp | 医保计划主键 | pk_hp | char(20) |  | 主键 (UFID) |
| 6 | eu_itemlevel | 医保等级 | eu_itemlevel | int |  | 整数 (Integer) |
| 7 | note | 备注 | note | varchar(50) |  | 字符串 (String) |