# |<<

**前置任务 (pm_wbs_prefix / nc.vo.ppm.wbs.WbsPrefixVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4557.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_wbs_prefix | 前置任务子表主键 | pk_wbs_prefix | char(20) | √ | 主键 (UFID) |
| 2 | pk_prefixwbs | 前置任务主键 | pk_prefixwbs | varchar(36) |  | 计划工作台 (wbshead) |
| 3 | relation | 逻辑关系 | relation | int |  | 逻辑关系类别 (logicRelation) |  | 1=FF; |