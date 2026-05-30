# |<<

**课题表 (uh_cn_topic / com.yonyou.yh.nhis.cn.emr.scre.vo.TopicVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6058.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_topic | 课题表主键 | pk_topic | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 组织 | pk_org | varchar(20) | √ | 组织 (org) |
| 4 | pk_psn | 用户 | pk_psn | varchar(20) |  | 字符串 (String) |
| 5 | name_topic | 课题名称 | name_topic | varchar(50) |  | 字符串 (String) |
| 6 | type_topic | 课题类型 | type_topic | varchar(50) |  | 课题类型 (type_topic_enum) |  | 1=原创; |