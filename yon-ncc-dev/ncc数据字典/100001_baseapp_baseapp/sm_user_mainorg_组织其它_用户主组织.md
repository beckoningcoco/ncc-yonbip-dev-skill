# |<<

**组织其它_用户主组织 (sm_user_mainorg / nc.vo.org.orgmodel.UserMainOrgVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5361.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_umo | 用户主组织主键 | pk_umo | char(20) | √ | 主键 (UFID) |
| 2 | userid | 用户主键 | userid | char(20) | √ | 字符串 (String) |
| 3 | orgelementtype | 组织元素类型 | orgelementtype | varchar(20) |  | 组织其它_组织类型 (orgtype) |
| 4 | mainorgid | 主组织主键 | mainorgid | varchar(20) |  | 组织 (org) |
| 5 | pk_group | 所属集团 | pk_group | char(20) | √ | 字符串 (String) |