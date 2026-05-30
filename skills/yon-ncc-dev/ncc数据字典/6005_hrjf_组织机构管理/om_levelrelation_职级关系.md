# |<<

**职级关系 (om_levelrelation / nc.vo.om.joblevelsys.LevelRelationVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3946.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_levelrelation | 职级关系主键 | pk_levelrelation | char(20) | √ | 主键 (UFID) |
| 2 | pk_jobtype | 职务类别 | pk_jobtype | varchar(20) |  | 职务类别 (jobtype) |
| 3 | pk_postseries | 岗位序列 | pk_postseries | varchar(20) |  | 岗位序列 (postseries) |
| 4 | pk_job | 职务 | pk_job | varchar(20) |  | 职务 (om_job) |
| 5 | pk_post | 岗位 | pk_post | varchar(20) |  | 岗位基本信息 (om_post) |
| 6 | pk_joblevelsys | 职级类别 | pk_joblevelsys | varchar(20) | √ | 职级类别 (om_joblevelsys) |
| 7 | pk_joblevel | 职级 | pk_joblevel | char(20) | √ | 职级 (om_joblevel) |
| 8 | defaultlevel | 默认职级 | defaultlevel | char(1) |  | 布尔类型 (UFBoolean) |
| 9 | dataoriginflag | 分布式 | dataoriginflag | int |  | 整数 (Integer) |
| 10 | jobrank | 对应职等 | jobrank | varchar(20) |  | 职等 (jobrank) |
| 11 | defaultrank | 默认职等 | defaultrank | varchar(20) |  | 职等 (jobrank) |
| 12 | memo | 职级概要描述 | memo | varchar(50) |  | 字符串 (String) |