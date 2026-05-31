# |<<

**消息默认接收人 (hr_notice_receiver / nc.vo.hr.notice.NoticeReceiverVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2686.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_notice_receiver | 消息接收人主键 | pk_notice_receiver | char(20) | √ | 主键 (UFID) |
| 2 | pk_notice_templet | 通知模板主键 | pk_notice_templet | varchar(20) |  | 主键 (UFID) |
| 3 | pk_user | 用户主键 | pk_user | varchar(20) |  | 用户 (user) |