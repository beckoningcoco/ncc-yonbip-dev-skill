# |<<

**服务控制_人员_项目 (bd_uh_srv_ctr_psn_item / com.yonyou.yh.nhis.bd.srvctlpsnitem.vo.SrvCtlPsnItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1110.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_srvctrtypeitem | 服务项目控制项目明细主键 | pk_srvctrtypeitem | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | dt_psnsrvtype | 医师医疗项目权限分类编码 | dt_psnsrvtype | varchar(50) |  | 字符串 (String) |
| 5 | pk_psnsrvtype | 医师医疗项目权限分类 | pk_psnsrvtype | varchar(20) |  | 医师医疗项目权限分类(自定义档案) (Defdoc-010305) |
| 6 | pk_srv | 服务 | pk_srv | varchar(50) |  | 字符串 (String) |
| 7 | quan_limit | 限制数量_医学单位 | quan_limit | decimal(14, 2) |  | 数值 (UFDouble) |
| 8 | note | 使用描述 | note | varchar(256) |  | 字符串 (String) |
| 9 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 10 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 11 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 12 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |