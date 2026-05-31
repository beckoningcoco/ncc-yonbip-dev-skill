# |<<

**分销渠道节点主实体 (dcm_chnlnode / nc.vo.scmf.dcm.chnlnode.entity.ChnlNodeHVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1691.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_channelnode | 分销渠道节点主键 | pk_channelnode | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 销售组织 | pk_org | varchar(20) |  | 组织_业务单元_销售组织 (salesorg) |
| 3 | vcode | 渠道节点编码 | vcode | varchar(40) |  | 字符串 (String) |
| 4 | vname | 渠道节点名称 | vname | varchar(200) |  | 多语文本 (MultiLangText) |
| 5 | ccustomerid | 对应客户 | ccustomerid | varchar(20) |  | 客户基本信息 (customer) |
| 6 | cchanltypeid | 渠道类型 | cchanltypeid | varchar(20) |  | 渠道类型 (channeltype) |
| 7 | cchnlmngtypid | 渠道管理分类 | cchnlmngtypid | varchar(20) |  | 渠道管理分类 (dcm_chnlmngtype) |
| 8 | cspecialdeptid | 专管部门 | cspecialdeptid | varchar(20) |  | 组织_部门 (dept) |
| 9 | cspecialpersonid | 专管业务员 | cspecialpersonid | varchar(20) |  | 人员基本信息 (psndoc) |
| 10 | itransadvcday | 运输提前期 | itransadvcday | int |  | 整数 (Integer) |
| 11 | vemailaddr | 邮件地址 | vemailaddr | varchar(200) |  | 字符串 (String) |
| 12 | vrvtemailaddr | 邮件回复地址 | vrvtemailaddr | varchar(200) |  | 字符串 (String) |
| 13 | vlinkman | 联系人 | vlinkman | varchar(200) |  | 字符串 (String) |
| 14 | vtelphone | 电话 | vtelphone | varchar(20) |  | 字符串 (String) |
| 15 | vmobilephone | 联系人手机 | vmobilephone | varchar(20) |  | 字符串 (String) |
| 16 | caddressid | 所属地点 | caddressid | varchar(20) |  | 地点档案 (addressdoc) |
| 17 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 18 | fstatusflag | 启用状态 | fstatusflag | int |  | 启用状态 (FStatusFlag) |  | 0=启用; |