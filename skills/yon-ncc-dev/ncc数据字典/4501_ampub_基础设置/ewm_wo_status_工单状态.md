# |<<

**工单状态 (ewm_wo_status / nc.vo.am.wostatus.WostatusVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1972.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_wo_status | 工单状态标识 | pk_wo_status | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | status_code | 编码 | status_code | varchar(40) |  | 字符串 (String) |
| 4 | status_name | 名称 | status_name | varchar(80) |  | 多语文本 (MultiLangText) |
| 5 | status_type | 状态类别 | status_type | int |  | 工单状态类别 (WOStatusType) |  | -1=作废; |