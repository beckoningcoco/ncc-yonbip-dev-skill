# |<<

**人力资源管理_岗位 (om_post / nc.vo.org.PostVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3951.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_post | 岗位主键 | pk_post | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(0) | √ | 组织_集团 (group) |
| 3 | pk_org | 所属组织 | pk_org | varchar(20) | √ | 组织 (org) |
| 4 | postcode | 岗位编码 | postcode | varchar(40) | √ | 字符串 (String) |
| 5 | postname | 岗位名称 | postname | varchar(200) | √ | 多语文本 (MultiLangText) |
| 6 | pk_dept | 所属部门 | pk_dept | varchar(20) | √ | 组织_部门 (dept) |
| 7 | pk_job | 所属职务 | pk_job | varchar(20) |  | 人力资源管理_职务 (job) |
| 8 | pk_postseries | 岗位序列 | pk_postseries | varchar(20) |  | 人力资源管理_岗位序列 (postseries) |
| 9 | suporior | 上级岗位 | suporior | varchar(20) |  | 人力资源管理_岗位 (post) |
| 10 | junior | 直接下级 | junior | varchar(50) |  | 字符串 (String) |
| 11 | innercode | 内部码 | innercode | varchar(200) |  | 字符串 (String) |
| 12 | seq | 序号 | seq | varchar(50) |  | 字符串 (String) |
| 13 | builddate | 成立日期 | builddate | char(10) |  | 模糊日期 (UFLiteralDate) |
| 14 | worksumm | 工作概要 | worksumm | varchar(1024) |  | 备注 (Memo) |
| 15 | isabort | 是否已经撤消 | isabort | char(1) |  | 布尔类型 (UFBoolean) |
| 16 | abortdate | 撤销日期 | abortdate | char(10) |  | 模糊日期 (UFLiteralDate) |
| 17 | isdeptrespon | 是否部门负责岗位 | isdeptrespon | char(1) |  | 布尔类型 (UFBoolean) |
| 18 | employment | 职业 | employment | varchar(20) |  | 主键 (UFID) |
| 19 | worktype | 工种 | worktype | varchar(20) |  | 主键 (UFID) |
| 20 | reqedu | 学历要求 | reqedu | varchar(50) |  | 字符串 (String) |
| 21 | reqsex | 性别要求 | reqsex | int |  | 字符串 (String) |
| 22 | reqyold | 年龄要求 | reqyold | varchar(50) |  | 字符串 (String) |
| 23 | reqpro | 专业背景要求 | reqpro | varchar(50) |  | 字符串 (String) |
| 24 | reqexp | 工作经验要求 | reqexp | varchar(50) |  | 字符串 (String) |
| 25 | reqworktime | 工作时间要求 | reqworktime | int |  | 字符串 (String) |
| 26 | reqother | 其他要求 | reqother | varchar(50) |  | 字符串 (String) |
| 27 | enablestate | 启用状态 | enablestate | int |  | 启用状态 (enablestate) | 2 | 1=未启用; |