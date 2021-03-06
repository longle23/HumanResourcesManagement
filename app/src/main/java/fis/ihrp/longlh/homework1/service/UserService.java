package fis.ihrp.longlh.homework1.service;

import com.google.gson.JsonObject;

import fis.ihrp.longlh.homework1.model.CapNhatDonRequest;
import fis.ihrp.longlh.homework1.model.ChiTietDonNghiRequest;
import fis.ihrp.longlh.homework1.model.ChuyenDuyetRequest;
import fis.ihrp.longlh.homework1.model.DuyetDonRequest;
import fis.ihrp.longlh.homework1.model.FindEmployeeRequest;
import fis.ihrp.longlh.homework1.model.ListFuncionRequest;
import fis.ihrp.longlh.homework1.model.LoaiNghiRequest;
import fis.ihrp.longlh.homework1.model.LoginRequest;
import fis.ihrp.longlh.homework1.model.NguoiKiemDuyetRequest;
import fis.ihrp.longlh.homework1.model.RutDonNghiRequest;
import fis.ihrp.longlh.homework1.model.TimDonChoDuyetRequest;
import fis.ihrp.longlh.homework1.model.TimDonNghiRequest;
import fis.ihrp.longlh.homework1.model.TinhPhepRequest;
import fis.ihrp.longlh.homework1.model.TinhTrangRequest;
import fis.ihrp.longlh.homework1.model.TuChoiDonRequest;
import fis.ihrp.longlh.homework1.model.XoaDonRequest;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface UserService {

    @POST("api/v1/login")
    Call<JsonObject> loginUser(@Body LoginRequest loginmodel);

//    @POST("api/v1/add")
//    Call<LoginRequest> addUser(@Body LoginRequest loginmodel);
//
//    @POST("api/v1/delete")
//    Call<LoginRequest> DeleteUser(@Body LoginRequest loginmodel);

    @POST("api/v1/function/employee/find")
    Call<JsonObject> findEmployee(@Body FindEmployeeRequest findEmployeeRequest);

    @POST("api/v1/function/property/list")
    Call<JsonObject> listFuncion(@Body ListFuncionRequest listFuncionRequest);

    @POST("api/v1/workflow1/list")
    Call<JsonObject> loaiNghiFuncion(@Body LoaiNghiRequest loaiNghiRequest);

    @POST("api/v1/workflow1/view/approver")
    Call<JsonObject> loadNguoiKiemDuyet(@Body NguoiKiemDuyetRequest nguoiKiemDuyetRequest);

    @POST("api/v1/workflow1/view/calculate")
    Call<JsonObject> tinhPhep(@Body TinhPhepRequest tinhPhepRequest);

    @POST("api/v1/workflow1/requester/create")
    Call<JsonObject> chuyenDuyet(@Body ChuyenDuyetRequest chuyenDuyetRequest);

    @POST("api/v1/workflow2/list")
    Call<JsonObject> tinhTrang(@Body TinhTrangRequest tinhTrangRequest);

    @POST("api/v1/workflow1/requester/find")
    Call<JsonObject> timKiemDon(@Body TimDonNghiRequest timDonNghiRequest);

    @POST("api/v1/workflow1/view/application")
    Call<JsonObject> chiTietDonNghi(@Body ChiTietDonNghiRequest chiTietDonNghiRequest);

    @POST("api/v1/workflow1/requester/update")
    Call<JsonObject> rutDonNghi(@Body RutDonNghiRequest rutDonNghiRequest);

    @POST("api/v1/workflow1/requester/update")
    Call<JsonObject> capNhatDon(@Body CapNhatDonRequest capNhatDonRequest);

    @POST("api/v1/workflow1/requester/delete")
    Call<JsonObject> xoaDon(@Body XoaDonRequest xoaDonRequest);

    @POST("api/v1/workflow1/approver/find")
    Call<JsonObject> timDonChoDuyet(@Body TimDonChoDuyetRequest timDonChoDuyetRequest);

    @POST("api/v1/workflow1/approver/update")
    Call<JsonObject> duyetDon(@Body DuyetDonRequest duyetDonRequest);

    @POST("api/v1/workflow1/approver/update")
    Call<JsonObject> tuChoiDon(@Body TuChoiDonRequest tuChoiDonRequest);

}
