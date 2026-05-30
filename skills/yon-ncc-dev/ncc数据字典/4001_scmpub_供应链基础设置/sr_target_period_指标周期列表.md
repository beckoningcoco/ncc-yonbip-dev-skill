# |<<

**指标周期列表 (sr_target_period / nc.vo.scmf.sr.target.entity.TargetPeriodBVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5487.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_target_period | 指标周期子实体 | pk_target_period | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | vperiod | 指标期间 | vperiod | varchar(30) |  | 字符串 (String) |
| 4 | dprdbegindate | 开始日期 | dprdbegindate | char(19) |  | 日期(开始) (UFDateBegin) |
| 5 | dprdenddate | 结束日期 | dprdenddate | char(19) |  | 日期(结束) (UFDateEnd) |