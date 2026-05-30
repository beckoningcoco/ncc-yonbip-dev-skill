# |<<

**服务控制_人员_项目分类 (bd_uh_srv_ctr_psn_cate / com.yonyou.yh.nhis.bd.srvctlpsncate.vo.SrvCtlPsnCateVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1109.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_srvctrtypecate | 服务项目控制分类明细主键 | pk_srvctrtypecate | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | dt_psnsrvtype | 医师医疗项目权限分类编码 | dt_psnsrvtype | varchar(50) |  | 字符串 (String) |
| 5 | pk_psnsrvtype | 医师医疗项目权限分类 | pk_psnsrvtype | varchar(20) |  | 医师医疗项目权限分类(自定义档案) (Defdoc-010305) |
| 6 | pk_srvcate | 服务分类 | pk_srvcate | varchar(50) |  | 字符串 (String) |
| 7 | note | 使用描述 | note | varchar(256) |  | 字符串 (String) |
| 8 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 9 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 10 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 11 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |