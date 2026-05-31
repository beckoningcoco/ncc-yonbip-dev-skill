# |<<

**合同期限类型 (hrcm_termtype / nc.vo.hr.termtype.TermTypeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2711.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_termid | 合同期限类型主键 | pk_termid | char(20) | √ | 主键 (UFID) |
| 2 | pk_ptermid | 上级合同期限类型 | pk_ptermid | varchar(20) |  | 合同期限类型 (TermTypeVO) |
| 3 | termcode | 合同期限类型编码 | termcode | varchar(100) |  | 字符串 (String) |
| 4 | termname | 合同期限类型名称 | termname | varchar(1024) |  | 多语文本 (MultiLangText) |
| 5 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 6 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 7 | remark | 备注 | remark | varchar(1024) |  | 备注 (Memo) |
| 8 | ifdel | 删除权限 | ifdel | char(1) |  | 布尔类型 (UFBoolean) |
| 9 | enablestate | 启用状态 | enablestate | int |  | 启用状态 (enablestate) |  | 1=未启用; |