# |<<

**通知模板 (hr_notice_templet / nc.vo.hr.notice.NoticeTempletVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2688.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_notice_templet | 模板主键 | pk_notice_templet | char(20) | √ | 主键 (UFID) |
| 2 | pk_notice_sort | 类别主键 | pk_notice_sort | varchar(20) |  | 主键 (UFID) |
| 3 | templet_code | 模板编码 | templet_code | varchar(28) |  | 字符串 (String) |
| 4 | templet_name | 模板名称 | templet_name | varchar(200) |  | 多语文本 (MultiLangText) |
| 5 | templet_title | 模板标题 | templet_title | varchar(128) |  | 字符串 (String) |
| 6 | content_format | 内容格式 | content_format | int |  | 内容格式 (content_format) | 1 | 1=普通文本; |