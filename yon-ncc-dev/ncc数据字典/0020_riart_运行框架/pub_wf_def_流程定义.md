# |<<

**流程定义 (pub_wf_def / nc.vo.wfengine.definition.WorkflowDefinitionVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4786.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_wf_def | 工作流定义标识 | pk_wf_def | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 3 | billtype | 单据类型 | billtype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 4 | node_name | 流程名称 | node_name | varchar(50) |  | 字符串 (String) |
| 5 | workflow_type | 流程类型 | workflow_type | varchar(50) |  | 流程类型 (workflowtype) |  | 1=包; |