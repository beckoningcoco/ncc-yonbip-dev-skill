# |<<

**票据管理_领用_票据包 (un_bl_inv_iss_pkg / com.yonyou.yh.nhis.bl.invc.vo.BlInvcIssPkgVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6299.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_invisspk | 票据领用主键 | pk_invisspk | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 所属组织 | pk_org | varchar(20) |  | 组织_业务单元_医卫 (hisorg) |
| 4 | date_iss | 领用日期 | date_iss | char(19) |  | 日期时间 (UFDateTime) |
| 5 | pk_invissdt | 票据领用明细 | pk_invissdt | varchar(20) |  | 票据管理_领用_明细 (BlInvcissDtDetailVO) |
| 6 | pk_psn_inv | 领用人员 | pk_psn_inv | varchar(20) |  | 人员基本信息 (psndoc) |
| 7 | computer_use | 使用机器 | computer_use | varchar(30) |  | 字符串 (String) |
| 8 | pk_invcate | 票据分类 | pk_invcate | varchar(20) |  | 票据分类 (InvCateVO) |
| 9 | eu_invmana | 票据管理模式 | eu_invmana | int |  | 票据管理模式 (invcmanamode) |  | 0=单张管理; |