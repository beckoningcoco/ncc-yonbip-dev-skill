# |<<

**物料维度修订子实体 (sr_plcy_mar_r / nc.vo.sr.policy.revise.entity.PlcyMarReviseVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5467.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_plcy_mar_r | 物料维度修订子实体 | pk_plcy_mar_r | char(20) | √ | 主键 (UFID) |
| 2 | pk_plcy_mar | 物料维度子实体 | pk_plcy_mar | char(20) |  | 主键 (UFID) |
| 3 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | cprodlineid | 产品线 | cprodlineid | varchar(20) |  | 产品线 (prodline) |
| 5 | cbrandid | 品牌 | cbrandid | varchar(20) |  | 品牌档案 (branddoc) |
| 6 | cmarbaseclassid | 物料基本分类 | cmarbaseclassid | varchar(20) |  | 物料基本分类 (marbasclass) |
| 7 | cmarsaleclassid | 物料销售分类 | cmarsaleclassid | varchar(20) |  | 物料销售分类 (marsaleclass) |
| 8 | cmarterialid | 物料 | cmarterialid | varchar(20) |  | 物料基本信息 (material_v) |
| 9 | cmarcombineid | 物料组合 | cmarcombineid | char(20) |  | 主键 (UFID) |
| 10 | crmvmarcomid | 返利值计算排除物料组合 | crmvmarcomid | char(20) |  | 主键 (UFID) |
| 11 | pk_plcy | 返利政策主实体 | pk_plcy | char(20) |  | 主键 (UFID) |