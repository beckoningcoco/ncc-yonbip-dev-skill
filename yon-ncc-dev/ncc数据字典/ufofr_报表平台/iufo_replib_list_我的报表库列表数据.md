# |<<

**我的报表库列表数据 (iufo_replib_list / nc.vo.iufo.portal.RepLibraryListVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3496.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_replib_list | 邮件主键 | pk_replib_list | char(20) | √ | 主键 (UFID) |
| 2 | pk_replib_detail | 关联条件 | pk_replib_detail | varchar(50) |  | 字符串 (String) |
| 3 | receiver | 收件人 | receiver | varchar(20) |  | 用户 (user) |
| 4 | pk_pid | 上级文件夹 | pk_pid | varchar(50) |  | 字符串 (String) |
| 5 | name | 邮件主题 | name | varchar(200) |  | 字符串 (String) |
| 6 | code | 邮件代码 | code | varchar(50) |  | 字符串 (String) |
| 7 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 8 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 9 | priority | 优先级 | priority | varchar(50) |  | 优先级 (enumLibraryPriority) |  | -1=缓慢; |