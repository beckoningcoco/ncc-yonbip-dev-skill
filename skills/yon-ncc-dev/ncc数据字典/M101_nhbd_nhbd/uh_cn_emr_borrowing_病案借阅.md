# |<<

**病案借阅 (uh_cn_emr_borrowing / com.yonyou.yh.nhis.bd.ecd.vo.CNEmrborrowingVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5995.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_emrborrowing | 借阅主键 | pk_emrborrowing | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属机构 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | pk_pati | 患者主键 | pk_pati | varchar(50) |  | 字符串 (String) |
| 5 | pk_pv | 就诊主键 | pk_pv | varchar(50) |  | 字符串 (String) |
| 6 | pk_psn_req | 申请人 | pk_psn_req | varchar(20) |  | 人员基本信息 (psndoc) |
| 7 | name_psn_req | 申请人姓名 | name_psn_req | varchar(50) |  | 字符串 (String) |
| 8 | pk_dept_req | 申请人科室 | pk_dept_req | varchar(20) |  | 组织_部门 (dept) |
| 9 | status_req | 申请状态 | status_req | int |  | 申请状态 (CNEmrBorrowsStatusReq) |  | 1=申请; |