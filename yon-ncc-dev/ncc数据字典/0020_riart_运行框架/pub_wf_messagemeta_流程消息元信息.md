# |<<

**流程消息元信息 (pub_wf_messagemeta / nc.vo.pf.msg.MessageMetaVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4788.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_wf_messagemeta | 流程消息元信息主键 | pk_wf_messagemeta | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团主键 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | message_type | 消息类型 | message_type | varchar(50) |  | 消息类型枚举 (enum) |  | email-notice=邮件通知; |