# |<<

**转帐分类定义权限设置信息表 (gl_transperm / nc.vo.gl.gl_transperm.transperm)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2491.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_transperm | 转账权限标识 | pk_transperm | char(20) | √ | 主键 (UFID) |
| 2 | iscorppublic | 是否公用 | iscorppublic | char(1) |  | 布尔类型 (UFBoolean) |
| 3 | pk_transsort | 转帐分类PK | pk_transsort | char(20) |  | 主键 (UFID) |
| 4 | pk_role | 关联角色 | pk_role | char(20) |  | 主键 (UFID) |
| 5 | pk_user | 关联操作员 | pk_user | char(20) |  | 主键 (UFID) |
| 6 | pk_group | 所属集团 | pk_group | char(20) |  | 主键 (UFID) |
| 7 | pk_unit | 关联业务单元 | pk_unit | char(20) |  | 主键 (UFID) |