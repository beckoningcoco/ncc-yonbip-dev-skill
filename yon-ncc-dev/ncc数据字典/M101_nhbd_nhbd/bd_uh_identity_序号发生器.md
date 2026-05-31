# |<<

**序号发生器 (bd_uh_identity / com.yonyou.nhis.bd.pub2.srv.vo.UhIdentityVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1043.html

| 序号发生器 (bd_uh_identity / com.yonyou.nhis.bd.pub2.srv.vo.UhIdentityVO) |
|------|
| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
| 1 | pk_identity | 主键 | pk_identity | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(50) |  | 字符串 (String) |
| 3 | pk_org | 所属机构 | pk_org | varchar(50) |  | 字符串 (String) |
| 4 | tbname | 表名称 | tbname | varchar(30) |  | 字符串 (String) |
| 5 | val | 当前值 | val | int |  | 整数 (Integer) |