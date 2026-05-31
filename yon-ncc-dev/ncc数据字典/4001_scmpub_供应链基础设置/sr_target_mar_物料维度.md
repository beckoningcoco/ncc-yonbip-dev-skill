# |<<

**物料维度 (sr_target_mar / nc.vo.scmf.sr.target.entity.TargetMarBVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5485.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_target_mar | 物料维度子实体 | pk_target_mar | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | cmarrowno | 行号 | cmarrowno | varchar(20) |  | 字符串 (String) |
| 4 | cprodlineid | 产品线 | cprodlineid | varchar(20) |  | 产品线 (prodline) |
| 5 | cbrandid | 品牌 | cbrandid | varchar(20) |  | 品牌档案 (branddoc) |
| 6 | cmarbaseclassid | 物料基本分类 | cmarbaseclassid | varchar(20) |  | 物料基本分类 (marbasclass) |
| 7 | cmarsaleclassid | 物料销售分类 | cmarsaleclassid | varchar(20) |  | 物料销售分类 (marsaleclass) |
| 8 | cmaterialid | 物料 | cmaterialid | varchar(20) |  | 物料基本信息 (material_v) |
| 9 | cmarcombineid | 物料组合 | cmarcombineid | varchar(20) |  | 物料组合主实体 (sr_marcombine) |
| 10 | crmvmarcomid | 返利值计算排除物料组合 | crmvmarcomid | varchar(20) |  | 物料组合主实体 (sr_marcombine) |