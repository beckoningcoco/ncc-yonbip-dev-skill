# |<<

**通知模板项目 (hr_notice_item / nc.vo.hr.notice.NoticeItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2685.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_notice_item | 项目主键 | pk_notice_item | char(20) | √ | 主键 (UFID) |
| 2 | pk_notice_sort | 类别主键 | pk_notice_sort | varchar(20) |  | 主键 (UFID) |
| 3 | item_code | 项目编码 | item_code | varchar(28) |  | 字符串 (String) |
| 4 | item_name | 项目名称 | item_name | varchar(200) |  | 多语文本 (MultiLangText) |
| 5 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 6 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |