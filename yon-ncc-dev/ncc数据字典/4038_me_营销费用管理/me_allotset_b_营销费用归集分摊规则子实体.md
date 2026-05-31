# |<<

**营销费用归集分摊规则子实体 (me_allotset_b / nc.vo.me.allotset.entity.AllotSetBVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3604.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_allotset_b | 营销费用归集分摊规则子实体 | pk_allotset_b | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织_集团 (group) |
| 4 | cprodlineid | 产品线 | cprodlineid | varchar(20) |  | 产品线 (prodline) |
| 5 | cbrandid | 品牌 | cbrandid | varchar(20) |  | 品牌档案 (branddoc) |
| 6 | cmarbasclassid | 物料基本分类 | cmarbasclassid | varchar(20) |  | 物料基本分类 (marbasclass) |
| 7 | cmarsaleclassid | 物料销售分类 | cmarsaleclassid | varchar(20) |  | 物料销售分类 (marsaleclass) |
| 8 | cmaterialid | 物料 | cmaterialid | varchar(20) |  | 物料基本信息 (material_v) |
| 9 | bremoveflag | 排除 | bremoveflag | char(1) |  | 布尔类型 (UFBoolean) |