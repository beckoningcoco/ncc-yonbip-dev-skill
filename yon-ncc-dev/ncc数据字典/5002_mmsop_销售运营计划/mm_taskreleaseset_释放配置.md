# |<<

**释放配置 (mm_taskreleaseset / nc.vo.mmsop.ppm.releaseset.entity.TaskReleaseSetVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3791.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_taskreleaseset | 释放配置 | pk_taskreleaseset | char(20) | √ | 主键 (UFID) |
| 2 | taskid | 任务ID | taskid | varchar(50) |  | 字符串 (String) |
| 3 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_org | 组织 | pk_org | varchar(20) |  | 组织_业务单元_工厂 (factory) |
| 5 | pk_org_v | 组织多版本 | pk_org_v | varchar(20) |  | 组织_业务单元_工厂版本信息 (factory_v) |
| 6 | releasetargetbill | 释放目标 | releasetargetbill | varchar(50) |  | 释放目标单据 (taskreleasesetenum) |  | 55PD=计划独立需求; |