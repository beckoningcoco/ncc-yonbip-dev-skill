# |<<

**外系统监听的共享中心事件 (ssctp_eventlistener / nc.vo.ssctp.dooroad.DREventListenerVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5645.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_eventlistener | 唯一标识 | pk_eventlistener | char(20) | √ | 主键 (UFID) |
| 2 | pk_ots | 外系统主键 | pk_ots | varchar(20) |  | 第三方系统档案 (ssctp_ots) |
| 3 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_org | 组织 | pk_org | varchar(20) |  | 组织 (org) |
| 5 | pk_transtype | 交易类型 | pk_transtype | varchar(20) |  | 交易类型 (transtype) |
| 6 | transtype_code | 交易类型编码 | transtype_code | varchar(50) |  | 字符串 (String) |
| 7 | url | 地址 | url | varchar(500) |  | 字符串 (String) |
| 8 | eventtype | 事件类型 | eventtype | varchar(20) |  | 事件类型 (enum) |  | sscapprove=审批完成; |