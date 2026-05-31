# |<<

**前置任务 (pm_wbst_prefix_bs / nc.vo.pmbd.wbstemplet.WbsPrefixVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4559.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_wbs_prefix | 前置任务子表主键 | pk_wbs_prefix | char(20) | √ | 主键 (UFID) |
| 2 | pk_prefixwbs | 前置任务 | pk_prefixwbs | varchar(36) |  | WBS模板任务 (wbstempletbody) |
| 3 | relation | 逻辑关系 | relation | int |  | 逻辑关系类别 (logicRelation) |  | 1=FF; |