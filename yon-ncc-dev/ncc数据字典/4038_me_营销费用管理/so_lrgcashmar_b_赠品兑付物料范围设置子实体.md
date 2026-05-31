# |<<

**赠品兑付物料范围设置子实体 (so_lrgcashmar_b / nc.vo.me.lrgcashmar.entity.LrgCashMarBVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5415.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_lrgcashmar_b | 赠品兑付物料范围设置子实体 | pk_lrgcashmar_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 销售组织 | pk_org | varchar(20) |  | 组织_业务单元_销售组织 (salesorg) |
| 4 | cprodlineid | 产品线 | cprodlineid | varchar(20) |  | 产品线 (prodline) |
| 5 | cmarbasclassid | 物料分类 | cmarbasclassid | varchar(20) |  | 物料基本分类 (marbasclass) |
| 6 | cmaterialid | 物料 | cmaterialid | varchar(20) |  | 物料基本信息 (material_v) |
| 7 | bremoveflag | 排除 | bremoveflag | char(1) |  | 布尔类型 (UFBoolean) |