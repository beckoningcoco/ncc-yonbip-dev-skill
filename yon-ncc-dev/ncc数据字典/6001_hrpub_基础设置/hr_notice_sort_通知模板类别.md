# |<<

**通知模板类别 (hr_notice_sort / nc.vo.hr.notice.NoticeSortVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2687.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_notice_sort | 类别主键 | pk_notice_sort | char(20) | √ | 主键 (UFID) |
| 2 | pk_parent_sort | 上级类别 | pk_parent_sort | varchar(20) |  | 主键 (UFID) |
| 3 | sort_code | 类别编码 | sort_code | varchar(28) |  | 字符串 (String) |
| 4 | sort_name | 类别名称 | sort_name | varchar(200) |  | 多语文本 (MultiLangText) |
| 5 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 6 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |