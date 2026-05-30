# |<<

**业务流程图元 (sm_busiworkflow_cell / nc.vo.sm.flowdesktop.BusiFlowCellVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5294.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_cell | 主键 | pk_cell | char(20) | √ | 主键 (UFID) |
| 2 | pk_busiworkflow | 流程图主键 | pk_busiworkflow | varchar(20) |  | 流程导航 (BusiFlow) |
| 3 | cellid | 图元uuid | cellid | char(36) |  | 字符串 (String) |
| 4 | name | 图元名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |