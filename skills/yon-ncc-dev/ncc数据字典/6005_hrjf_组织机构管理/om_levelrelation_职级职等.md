# |<<

**职级职等 (om_levelrelation / nc.vo.om.joblevelsys.SubLevelRelationVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3943.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_levelrelation | 职级关系主键 | pk_levelrelation | char(20) | √ | 主键 (UFID) |
| 2 | pk_postseries | 岗位序列 | pk_postseries | varchar(20) |  | 岗位序列 (postseries) |
| 3 | pk_joblevelsys | 职级类别 | pk_joblevelsys | varchar(20) |  | 职级类别 (om_joblevelsys) |
| 4 | pk_joblevel | 职级 | pk_joblevel | char(20) |  | 职级 (om_joblevel) |
| 5 | jobrank | 对应职等 | jobrank | varchar(20) |  | 职等 (jobrank) |
| 6 | defaultrank | 默认职等 | defaultrank | varchar(20) |  | 职等 (jobrank) |
| 7 | defaultlevel | 默认职级 | defaultlevel | char(1) |  | 布尔类型 (UFBoolean) |
| 8 | memo | 职级概要描述 | memo | varchar(50) |  | 字符串 (String) |