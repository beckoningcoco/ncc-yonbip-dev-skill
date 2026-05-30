# |<<

**共享作业组 (ssctp_workinggroup / nc.vo.ssctp.sscbd.WorkingGroupVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5672.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_workinggroup | 唯一标识 | pk_workinggroup | char(20) | √ | 主键 (UFID) |
| 2 | pk_sscunit | 共享中心 | pk_sscunit | varchar(20) |  | 共享服务中心 (sscunit) |
| 3 | code | 编码 | code | varchar(200) |  | 字符串 (String) |
| 4 | name | 名称 | name | varchar(200) |  | 多语文本 (MultiLangText) |
| 5 | parentid | 上级 | parentid | varchar(20) |  | 字符串 (String) |
| 6 | formula | 公式 | formula | varchar(2000) |  | 字符串 (String) |
| 7 | formulashow | 公式显示 | formulashow | varchar(2000) |  | 字符串 (String) |
| 8 | fullpath | 层级 | fullpath | varchar(2000) |  | 字符串 (String) |
| 9 | fullpathshow | 层级显示 | fullpathshow | varchar(2000) |  | 字符串 (String) |
| 10 | isleaf | 是否末级 | isleaf | char(1) |  | 布尔类型 (UFBoolean) |
| 11 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 12 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织 (org) |
| 13 | innercode | 关联父code | innercode | varchar(40) |  | 字符串 (String) |
| 14 | enablestate | 是否启用 | enablestate | int |  | 整数 (Integer) |
| 15 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 16 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 17 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |
| 18 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |